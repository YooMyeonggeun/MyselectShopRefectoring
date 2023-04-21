package com.sparta.myselectshop.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SignupRequestDto {
    private String username;
    private String password;
    private String email;
    private boolean admin = false;  //관리자 권한 확인
    private String adminToken = ""; //관리자 토큰 값
}