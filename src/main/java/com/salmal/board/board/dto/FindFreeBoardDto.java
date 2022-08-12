package com.salmal.board.board.dto;

import com.querydsl.core.annotations.QueryProjection;
import com.salmal.board.board.entity.BoardStatus;
import com.salmal.board.board.entity.BoardType;
import com.salmal.board.board.entity.FreeBoard;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter @Setter
@ToString
public class FindFreeBoardDto {

    private Long id;
    private String title;
    private String content;
    private BoardType type;
    private BoardStatus status;
    private LocalDateTime createdDate;
    private long commentCount;


    @QueryProjection
    public FindFreeBoardDto(Long id, String title, String content, BoardType type, BoardStatus status, LocalDateTime createdDate, long commentCount) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.type = type;
        this.status = status;
        this.createdDate = createdDate;
        this.commentCount = commentCount;
    }

    public FindFreeBoardDto(FreeBoard freeBoard) {
        id = freeBoard.getId();
        title = freeBoard.getTitle();
        content = freeBoard.getContent();
        type = freeBoard.getType();
        status = freeBoard.getStatus();
        createdDate = freeBoard.getCreatedDate();
        commentCount = freeBoard.getCommentCount();

    }
}
