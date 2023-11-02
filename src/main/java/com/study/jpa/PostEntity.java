package com.study.jpa;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "cm_board_post")
@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class PostEntity {
    @Id
    @Column(name = "post_seq")
    private Integer postSeq;

    @Column(name = "board_id")
    private String boardId;

    @Column(name = "post_cont")
    private String postCont;

    @Column(name = "post_title")
    private String postTitle;

    @ManyToOne(targetEntity = CategoryEntity.class)
    @Column(name = "category_id")
    private String categoryId;

    @Column(name = "reg_date")
    private String regDate;
}