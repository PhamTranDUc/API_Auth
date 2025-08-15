package com.LG_CNS.React_LG_Final;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private String email;
    private String FullName;
    private LocalDate dateOfBirth;
    private String location;
    private String role;
    private String gender;
}
