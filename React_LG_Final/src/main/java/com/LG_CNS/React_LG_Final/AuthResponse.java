package com.LG_CNS.React_LG_Final;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse {
    private int statusCode;   // 200, 401, 403...
    private String message;   // "Login success", "Invalid credentials"
    private UserDto data;
}


