package com.LG_CNS.React_LG_Final;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/v1/login")
@RequiredArgsConstructor
public class AuthController {
//    private String email;
//    private String FullName;
//    private LocalDate dateOfBirth;
//    private String location;
//    private String role;
//    private String gender;
    @PostMapping()
    public ResponseEntity<AuthResponse> login(@RequestBody AuthDto authDto){
        if(authDto.getEmail().equals("admin@gmail.com") && authDto.getPassword().equals("admin123")){
            UserDto admin = new UserDto(
                    "admin@gmail.com",
                    "Phạm Trần Đức",
                    LocalDate.of(2001, 10, 6),
                    "Hà Nội",
                    "ADMIN",
                    "Male"
            );
            return ResponseEntity.ok(new AuthResponse(200, "Login success", admin));
        }else if(authDto.getEmail().equals("user@gmail.com") && authDto.getPassword().equals("user123")){
            UserDto user = new UserDto(
                    "user@gmail.com",
                    "Nguyễn Tiến Mạnh",
                    LocalDate.of(2002, 1, 1),
                    "TP. Hồ Chí Minh",
                    "USER",
                    "Male"
            );
            return ResponseEntity.ok(new AuthResponse(200, "Login success", user));
        }else {
            return ResponseEntity.ok(new AuthResponse(401, "Email or password invalid", null));
        }

    }
}
