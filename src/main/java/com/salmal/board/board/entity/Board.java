package com.salmal.board.board.entity;

import com.salmal.board.common.CommonEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
@Inheritance(strategy = InheritanceType.JOINED)
@EntityListeners(AuditingEntityListener.class)
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

    public Board(String title, String content, BoardStatus status) {
        this.title = title;
        this.content = content;
        this.status = status;
    }

    public void updateBoard(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
