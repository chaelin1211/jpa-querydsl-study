package com.study.jpa;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SearchVO {
    private String searchText;
    private String categoryId;
}
