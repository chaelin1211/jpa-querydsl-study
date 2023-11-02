package com.study.jpa;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cm_board_master")
@Builder
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MasterEntity {
    @Id
    @Column(name = "board_id")
    private String boardId;

    @Column(name = "board_name")
    private String boardName;

    @Column(name = "board_order")
    private String boardOrder;

    @Column(name = "use_yn")
    private String useYn;
}
