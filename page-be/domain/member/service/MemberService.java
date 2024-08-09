package KKSC.page.domain.member.service;

import KKSC.page.domain.member.dto.request.MemberLoginRequest;
import KKSC.page.domain.member.dto.request.MemberRequest;
import KKSC.page.domain.member.dto.response.MemberResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;

public interface MemberService {

    //회원가입
    /**
     * 회원가입
     * @return 미정
     * @since 2024.08.01
     */
    Long register(MemberRequest memberRequest);
}
