package com.study.jpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@WebMvcTest(controllers = {TestController.class})
class TestControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void searchPostList() throws Exception{
        SearchVO searchVO = SearchVO.builder()
                .searchText("test")
                .categoryId("test")
                .build();
        mockMvc.perform(post("/api/post", searchVO))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }
}