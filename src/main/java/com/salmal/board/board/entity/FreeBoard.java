package com.salmal.board.board.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@NoArgsConstructor
public class FreeBoard extends Board{

    @Column(name = "report_cnt")
    private long reportCount = 0;


    @Column(name = "bookmark_cnt")
    private long bookmarkCount = 0;


    @Column(name = "comment_cnt")
    private long commentCount = 0;
}
