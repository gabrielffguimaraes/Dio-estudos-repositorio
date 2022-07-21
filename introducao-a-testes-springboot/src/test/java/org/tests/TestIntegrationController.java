package org.tests;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@WebMvcTest
@ExtendWith(SpringExtension.class)
public class TestIntegrationController extends TestCase {
    @Autowired
    private MockMvc mvc;

    @Test
    public void testInt() throws Exception {
        RequestBuilder requestBuilder = get("/?nome=gabriel");
        MvcResult result = mvc.perform(requestBuilder).andReturn();
        assertEquals("Hello my friend , gabriel !",result.getResponse().getContentAsString());
    }
    @Test
    public void testSecond() throws Exception {
        mvc.perform(get("/?nome=gabriel"))
                .andExpect(content().string("Hello my friend , gabriell !"));
    }
}

