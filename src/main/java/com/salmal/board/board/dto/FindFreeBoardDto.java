package com.salmal.board.board.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class FindFreeBoardDto {

    private Long id;
    private String title;
    private String content;
    private String type;
    private String status;
    private LocalDateTime createdDate;
    private long commentCount;


    @QueryProjection
    public FindFreeBoardDto(Long id, String title, String content, String type, String status, LocalDateTime createdDate, long commentCount) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.type = type;
        this.status = status;
        this.createdDate = createdDate;
        this.commentCount = commentCount;
    }
}
