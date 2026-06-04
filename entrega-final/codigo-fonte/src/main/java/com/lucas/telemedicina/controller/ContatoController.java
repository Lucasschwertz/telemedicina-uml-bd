package com.lucas.telemedicina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContatoController {

    @GetMapping("/contato")
    public String exibirFormulario() {
        return "forward:/contato.html";
    }
}
