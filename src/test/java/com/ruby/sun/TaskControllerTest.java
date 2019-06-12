package com.ruby.sun;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.*;
import org.springframework.boot.test.context.*;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class TaskControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testTaskAPIs() throws Exception {
        mockMvc.perform(get("/api/tasks/1")
                    .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(content().contentType("application/json;charset=UTF-8"))
                .andExpect(status().isOk())
                .andExpect(content().string(is("{\"id\":1,\"name\":\"create spring boot application\",\"dueDate\":\"2019-06-11\",\"completed\":false}")))
                .andExpect(jsonPath("$.name").value("create spring boot application"));

        mockMvc.perform(get("/api/tasks").contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$", hasSize(7)));

        mockMvc.perform(get("/api/tasks")
                .param("name", "config h2 console"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$.[0].name").value("config h2 console"));
    }
}