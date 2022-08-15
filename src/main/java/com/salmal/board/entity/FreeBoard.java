package com.salmal.board.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString()
public class FreeBoard extends Board {

    @Column(name = "report_cnt")
    private long reportCount = 0;


    @Column(name = "bookmark_cnt")
    private long bookmarkCount = 0;


    @Column(name = "comment_cnt")
    private long commentCount = 0;

    private Long commentId;

    private Long fileId;

    public FreeBoard(String title, String content, BoardStatus status, BoardType type) {
        super(title, content, status, type);
    }


//    public FreeBoard(String title, String content) {
//        super(title, content);
//    }

    public void updateFreeBoard(String title, String content) {
        updateBoard(title, content);
    }
}
