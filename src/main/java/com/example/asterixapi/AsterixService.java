package com.example.asterixapi;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AsterixService {
    private final AsterixRepository repo;
    public List<Character> findAll(){
        return  repo.findAll();
    }
}
