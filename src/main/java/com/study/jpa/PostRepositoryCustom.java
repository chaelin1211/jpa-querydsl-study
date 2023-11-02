package com.study.jpa;


import com.querydsl.core.Tuple;

import java.util.List;

public interface PostRepositoryCustom {
    List<Tuple> findPostList(SearchVO searchVO);
}
