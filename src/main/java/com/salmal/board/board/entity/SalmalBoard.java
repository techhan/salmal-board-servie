package com.salmal.board.board.entity;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Getter
@Entity
public class SalmalBoard extends Board{


    @Column(name = "report_cnt")
    private long reportCount = 0;

    @Column(name = "bookmark_cnt")
    private long bookmarkCount = 0;

    @Column(name = "comment_cnt")
    private long commentCount = 0;

    private Long voteId;

    private Long commentId;

    private Long fileId;

}
