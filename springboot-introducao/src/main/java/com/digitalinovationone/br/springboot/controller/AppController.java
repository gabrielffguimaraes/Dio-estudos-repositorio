package com.digitalinovationone.br.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class AppController {
    @Value("${app.message}")
    private String appMessage;

    @Value("${ENV_DB_URL:NENHUMA VÁRIAVEL DE AMBIENTE CONFIGURADA}")
    private String dbEnnviromentVariable;

    @GetMapping
    public String init() {
        return appMessage;
    }

    @GetMapping("/info")
    public String showSystemInfo() {
        return getEnviromentVariable();
    }

    public String getEnviromentVariable() {
        return "A seguinte variável de ambiente foi passada: " + dbEnnviromentVariable;
    }
}
