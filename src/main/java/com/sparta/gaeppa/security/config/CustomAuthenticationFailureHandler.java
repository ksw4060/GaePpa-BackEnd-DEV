package com.sparta.gaeppa.security.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.CredentialsExpiredException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {
    private final ObjectMapper objectMapper;

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
                                        AuthenticationException exception) throws IOException, ServletException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // 상태 코드 설정
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);

        // 실패 원인에 따라 다른 메시지를 반환
        Map<String, Object> responseData = new HashMap<>();

        if (exception.getClass().isAssignableFrom(BadCredentialsException.class)) {
            // 잘못된 자격 증명
            responseData.put("error", "Invalid credentials");
            responseData.put("message", "이메일 또는 비밀번호가 잘못되었습니다.");
        } else if (exception.getClass().isAssignableFrom(DisabledException.class)) {
            // 계정이 비활성화된 경우
            responseData.put("error", "Account disabled");
            responseData.put("message", "계정이 비활성화되어 로그인할 수 없습니다.");
        } else if (exception.getClass().isAssignableFrom(LockedException.class)) {
            // 계정이 잠긴 경우
            responseData.put("error", "Account locked");
            responseData.put("message", "계정이 잠겼습니다. 관리자에게 문의하세요.");
        } else if (exception.getClass().isAssignableFrom(CredentialsExpiredException.class)) {
            // 비밀번호가 만료된 경우
            responseData.put("error", "Credentials expired");
            responseData.put("message", "비밀번호가 만료되었습니다. 비밀번호를 재설정하세요.");
        } else {
            // 기타 예외 처리
            responseData.put("error", "Authentication failed");
            responseData.put("message", "인증에 실패했습니다.");
        }

        responseData.put("timestamp", System.currentTimeMillis());
        responseData.put("status", HttpServletResponse.SC_UNAUTHORIZED);

        // JSON 응답 작성
        response.getWriter().write(objectMapper.writeValueAsString(responseData));
    }
}
