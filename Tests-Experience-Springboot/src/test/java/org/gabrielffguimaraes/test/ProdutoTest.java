package org.gabrielffguimaraes.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.gabrielffguimaraes.test.model.Produto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.net.URI;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@SpringBootTest
@AutoConfigureMockMvc
public class ProdutoTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;


    @Test
    public void testeEndPointProduto() throws Exception {
        URI uri = new URI("/produto");

        Produto p = new Produto();
        p.setDescricao("Chinelo");
        p.setPreco(20.5);
        p.setId(1l);
        String data = mapper.writeValueAsString(p);
        mockMvc.perform(MockMvcRequestBuilders
                .post(uri)
                .content(data)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().is(201))
                .andExpect((ResultMatcher) content().json(data));
    }


}
