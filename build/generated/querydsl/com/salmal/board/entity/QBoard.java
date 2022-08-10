package com.salmal.board.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.salmal.board.board.entity.Board;
import com.salmal.board.board.entity.BoardStatus;
import com.salmal.board.board.entity.BoardType;


/**
 * QBoard is a Querydsl query type for Board
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoard extends EntityPathBase<Board> {

    private static final long serialVersionUID = -1146897782L;

    public static final QBoard board = new QBoard("board");

    public final com.salmal.board.common.QCommonEntity _super = new com.salmal.board.common.QCommonEntity(this);

    public final NumberPath<Long> bookmarkCount = createNumber("bookmarkCount", Long.class);

    public final NumberPath<Long> commentCount = createNumber("commentCount", Long.class);

    public final StringPath content = createString("content");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Long> reportCount = createNumber("reportCount", Long.class);

    public final EnumPath<BoardStatus> status = createEnum("status", BoardStatus.class);

    public final StringPath title = createString("title");

    public final EnumPath<BoardType> type = createEnum("type", BoardType.class);

    public final NumberPath<Long> viewCount = createNumber("viewCount", Long.class);

    public QBoard(String variable) {
        super(Board.class, forVariable(variable));
    }

    public QBoard(Path<? extends Board> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoard(PathMetadata metadata) {
        super(Board.class, metadata);
    }

}

