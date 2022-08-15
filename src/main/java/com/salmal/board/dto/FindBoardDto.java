package com.salmal.board.dto;

import com.querydsl.core.annotations.QueryProjection;
import com.salmal.board.entity.BoardStatus;
import com.salmal.board.entity.BoardType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class FindBoardDto {


    private Long id;
    private String title;
    private String content;
    private BoardStatus status;
    private BoardType type;
    private long viewCount;
    private LocalDateTime createdDate;

    @QueryProjection
    public FindBoardDto(Long id, String title, String content, BoardStatus status, BoardType type, long viewCount, LocalDateTime createdDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.status = status;
        this.type = type;
        this.viewCount = viewCount;
        this.createdDate = createdDate;
    }
}
