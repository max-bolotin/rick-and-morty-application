package com.example.rickandmortyapplication.service;

import com.example.rickandmortyapplication.model.MovieCharacter;
import java.util.List;

public interface MovieCharacterService {
    void syncExternalCharacters();

    MovieCharacter getRandomCharacter();

    List<MovieCharacter> findAllByNameContains(String namePart);
}
