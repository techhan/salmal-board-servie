package com.salmal.board.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.salmal.board.board.entity.BoardStatus;
import com.salmal.board.board.entity.BoardType;
import com.salmal.board.board.entity.SalmalBoard;


/**
 * QSalmalBoard is a Querydsl query type for SalmalBoard
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSalmalBoard extends EntityPathBase<SalmalBoard> {

    private static final long serialVersionUID = -55480592L;

    public static final QSalmalBoard salmalBoard = new QSalmalBoard("salmalBoard");

    public final QBoard _super = new QBoard(this);

    //inherited
    public final NumberPath<Long> bookmarkCount = _super.bookmarkCount;

    //inherited
    public final NumberPath<Long> commentCount = _super.commentCount;

    //inherited
    public final StringPath content = _super.content;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    //inherited
    public final NumberPath<Long> reportCount = _super.reportCount;

    //inherited
    public final EnumPath<BoardStatus> status = _super.status;

    //inherited
    public final StringPath title = _super.title;

    //inherited
    public final EnumPath<BoardType> type = _super.type;

    //inherited
    public final NumberPath<Long> viewCount = _super.viewCount;

    public QSalmalBoard(String variable) {
        super(SalmalBoard.class, forVariable(variable));
    }

    public QSalmalBoard(Path<? extends SalmalBoard> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSalmalBoard(PathMetadata metadata) {
        super(SalmalBoard.class, metadata);
    }

}

