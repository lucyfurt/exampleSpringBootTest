package com.springBootTest.springboottest.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    public String saudacao(String nome){
        return String.format("Bem-vindo, %s", nome);
    }
}
