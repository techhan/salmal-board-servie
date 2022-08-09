package com.salmal.board.entity;

import com.salmal.board.common.CommonEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Getter
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
    private long viewCount;

    @Column(name = "bookmark_cnt")
    private long bookmarkCount;

    @Column(name = "report_cnt")
    private long reportCount;

    @Column(name = "comment_cnt")
    private long commentCount;
}
