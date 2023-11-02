package com.study.jpa;

import com.querydsl.core.Tuple;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {
    private final PostRepository postRepository;

    List<Tuple> searchPostList(SearchVO searchVO) {
        return postRepository.findPostList(searchVO);
    }
}
