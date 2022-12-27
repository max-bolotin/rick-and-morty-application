package com.example.rickandmortyapplication.dto.external;

import lombok.Data;

@Data
public class ApiCharacterDto {
    private Long id;
    private String name;
    private String status;
    private String gender;
}
