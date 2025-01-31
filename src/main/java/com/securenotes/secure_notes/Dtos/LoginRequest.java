package com.securenotes.secure_notes.Dtos;


import lombok.Data;

@Data
public class LoginRequest {
    private String username;

    private String password;
}