package com.lucas.telemedicina.controller;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

class ContatoControllerTest {

    @Test
    void deveExibirPaginaDeContatoNaUrlAmigavel() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new ContatoController()).build();

        mockMvc.perform(get("/contato"))
                .andExpect(status().isOk())
                .andExpect(forwardedUrl("/contato.html"));
    }

    @Test
    void formularioDeveConterTodosOsCamposObrigatorios() throws IOException {
        var pagina = getClass().getResourceAsStream("/static/contato.html");

        assertNotNull(pagina);
        String html = new String(pagina.readAllBytes(), StandardCharsets.UTF_8);

        assertTrue(html.contains("name=\"nome\" type=\"text\" autocomplete=\"name\" required"));
        assertTrue(html.contains("name=\"email\" type=\"email\" autocomplete=\"email\" required"));
        assertTrue(html.contains("name=\"assunto\" type=\"text\" required"));
        assertTrue(html.contains("name=\"mensagem\" required"));
        assertTrue(html.contains("type=\"submit\">Enviar</button>"));
        assertTrue(html.contains("Mensagem enviada com sucesso!"));
    }
}
