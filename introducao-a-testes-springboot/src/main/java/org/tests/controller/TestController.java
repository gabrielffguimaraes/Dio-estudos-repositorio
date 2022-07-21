package org.tests.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String saudacao (@RequestParam(name="nome",defaultValue = "Dio") String nome) {
        return String.format("Hello my friend , %s !",nome);
    }
    @GetMapping("/soma")
    public Double soma (@RequestParam("n1") Double n1,@RequestParam("n2") Double n2) {
        return n1 + n2;
    }
}
