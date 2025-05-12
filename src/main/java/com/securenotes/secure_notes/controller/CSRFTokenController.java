package com.securenotes.secure_notes.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CSRFTokenController {

    @GetMapping("/api/csrf")
    public CsrfToken getCSRFToken(HttpServletRequest httpServletRequest) {
        return (CsrfToken) httpServletRequest.getAttribute(CsrfToken.class.getName());
    }
}
