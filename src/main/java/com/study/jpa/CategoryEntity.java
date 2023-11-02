package com.study.jpa;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cm_board_category")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@AllArgsConstructor
public class CategoryEntity {
    @Id
    @Column(name = "category_id")
    private String categoryId;

    @Column(name = "board_id")
    private String boardId;

    @Column(name = "use_yn")
    private String useYn;

    @Column(name = "category_order")
    private String categoryOrder;
}