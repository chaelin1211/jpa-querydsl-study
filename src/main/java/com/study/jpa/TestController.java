package com.study.jpa;

import com.querydsl.core.Tuple;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;

    @PostMapping("/api/post/")
    public List<Tuple> searchPostList(@RequestBody SearchVO searchVO) {
        return testService.searchPostList(searchVO);
    }
}
