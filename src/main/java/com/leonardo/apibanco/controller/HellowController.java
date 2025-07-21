package com.leonardo.apibanco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HellowController {
    @GetMapping
    public String saudar() {
        return "Projeto com Wellington";
    }

}
