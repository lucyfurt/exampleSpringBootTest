package com.springBootTest.springboottest.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    public String saudacao(@RequestParam(name="nome", defaultValue="DIO")String nome){
        return String.format("Bem-vindo, %s", nome);
    }
}
