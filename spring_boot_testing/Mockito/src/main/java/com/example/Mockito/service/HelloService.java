package com.example.Mockito.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getWelcomeMessage() {
        return "Hello World!";
    }
}