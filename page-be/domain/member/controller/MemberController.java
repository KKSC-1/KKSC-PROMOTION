package KKSC.page.domain.member.controller;

import KKSC.page.domain.member.dto.request.MemberRequest;
import KKSC.page.domain.member.dto.response.MemberResponse;
import KKSC.page.domain.member.exception.MemberException;
import KKSC.page.domain.member.service.MemberService;
import KKSC.page.global.auth.service.JwtService;
import KKSC.page.global.exception.ErrorCode;
import KKSC.page.global.exception.dto.ResponseVO;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;
    private final JwtService jwtService;

    // 회원가입
    @Operation(summary = " 회원가입 ", description = " 회원가입 ")
    @PostMapping("/")
    public ResponseVO<String> register(@RequestBody @Valid MemberRequest request) {
        Long createdId = memberService.register(request);
        return new ResponseVO<>("가입 완료. 사용자 아이디 : " + createdId);
    }

    /**
     * 로그인 -> global.auth.service.JwtLoginSuccessHandler 여기서 처리
     */

}