package com.example.demomybatisaudit;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

public class LoginUsers {

    public static String username() {
        SecurityContext context = SecurityContextHolder.getContext();
        if (context == null) {
            return null;
        }
        Authentication authentication = context.getAuthentication();
        if (authentication == null) {
            return null;
        }
        return authentication.getName();
    }

}
