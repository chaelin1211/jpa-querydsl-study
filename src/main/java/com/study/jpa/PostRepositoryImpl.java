package com.study.jpa;

import com.querydsl.core.Tuple;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.StringPath;
import com.querydsl.core.util.StringUtils;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PostRepositoryImpl implements PostRepositoryCustom {
    private final JPAQueryFactory jpaQueryFactory;
    private final QPostEntity qPostEntity = QPostEntity.postEntity;

    @Override
    public List<Tuple> findPostList(SearchVO searchVO) {
        return jpaQueryFactory.select(qPostEntity.postSeq, qPostEntity.postCont)
                .from(qPostEntity)
                .where(searchExpression(searchVO))
                .fetch();
    }

    private BooleanExpression getExpression(StringPath stringPath, String searchValue) {
        searchValue = searchValue != null ? searchValue.trim() : null;
        BooleanExpression booleanExpression = null;

        if (!StringUtils.isNullOrEmpty(searchValue)) {
            booleanExpression = stringPath.contains(searchValue);
        }

        return booleanExpression;
    }

    private BooleanExpression[] searchExpression(final SearchVO searchVO) {
        return new BooleanExpression[] {
                null
                , getExpression(qPostEntity.categoryId.categoryId, searchVO.getCategoryId())
                , getExpression(qPostEntity.postCont, searchVO.getSearchText())
        };
    }
}
