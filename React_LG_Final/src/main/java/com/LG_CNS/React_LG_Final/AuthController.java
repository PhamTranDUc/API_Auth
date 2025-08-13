package com.LG_CNS.React_LG_Final;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/login")
@RequiredArgsConstructor
public class AuthController {

    @PostMapping()
    public ResponseEntity<String> login(@RequestBody AuthDto authDto){
        if(authDto.getEmail().equals("admin@gmail.com") && authDto.getPassword().equals("admin123")){
            return ResponseEntity.ok("ADMIN");
        }else if(authDto.getEmail().equals("user@gmail.com") && authDto.getPassword().equals("user123")){
            return ResponseEntity.ok("USER");
        }else {
            return ResponseEntity.ok("Email or password invalid");
        }
    }
}
