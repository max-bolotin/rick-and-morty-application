package com.example.rickandmortyapplication.dto;

import com.example.rickandmortyapplication.model.Gender;
import com.example.rickandmortyapplication.model.Status;
import lombok.Data;

@Data
public class CharacterResponseDto {
    private Long id;
    private Long externalId;
    private String name;
    private Status status;
    private Gender gender;
}
