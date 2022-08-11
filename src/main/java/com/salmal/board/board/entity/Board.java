package com.salmal.board.board.entity;

import com.salmal.board.board.common.CommonEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
@Inheritance(strategy = InheritanceType.JOINED)
public class Board extends CommonEntity {

    @Id @GeneratedValue
    @Column(name = "article_id")
    private Long id;

    private String title;
    private String content;

    @Enumerated(EnumType.STRING)
    private BoardStatus status;

    @Enumerated(EnumType.STRING)
    @Column(name = "article_type")
    private BoardType type;

    @Column(name = "view_cnt")
    private long viewCount = 0;


    public Board(String title, String content, BoardStatus status, BoardType type) {
        this.title = title;
        this.content = content;
        this.status = status;
        this.type = type;
    }
}
