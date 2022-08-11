package com.salmal.board.board.entity;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.salmal.board.board.dto.FindBoardDto;
import com.salmal.board.board.dto.FindFreeBoardDto;
import com.salmal.board.board.dto.QFindBoardDto;
import com.salmal.board.board.dto.QFindFreeBoardDto;
import com.salmal.board.board.entity.Board;
import com.salmal.board.board.repository.BoardRepository;
import com.salmal.board.board.repository.FreeBoardRepository;
import org.apache.catalina.webresources.FileResourceSet;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Enumerated;
import java.util.List;
import java.util.Optional;

import static com.salmal.board.board.entity.QBoard.*;
import static com.salmal.board.board.entity.QFreeBoard.freeBoard;

@SpringBootTest
@Transactional
@Commit
class BoardTest {

    @Autowired
    EntityManager em;

    @Autowired
    BoardRepository boardRepository;

    @Autowired
    FreeBoardRepository freeBoardRepository;

    JPAQueryFactory jpaQueryFactory;

    @BeforeEach
    public void beforeEach() {
         jpaQueryFactory = new JPAQueryFactory(em);


        //String title, String content, BoardStatus status, BoardType type
        //Board boardTest = new Board("테스트 제목", "테스트 내용", BoardStatus.CREATED, BoardType.NOTICE);

        FreeBoard freeBoard = new FreeBoard("테스트 제목", "테스트 내용", BoardStatus.CREATED, BoardType.FREE_BOARD);
        //em.persist(boardTest);
        em.persist(freeBoard);

    }


    @Test
    public void find() {



        em.flush();
        em.clear();

//        List<FindBoardDto> findBoardDto = jpaQueryFactory
//                .select(new QFindBoardDto(board.id, board.title, board.content
//                        , board.status, board.type, board.viewCount, board.createdDate))
//                .from(board)
//                .fetch();

//        List<FindFreeBoardDto> findBoard = jpaQueryFactory
//                .select(new QFindFreeBoardDto(freeBoard.id, freeBoard.title, freeBoard.content,
//                        freeBoard.type, freeBoard.status, freeBoard.createdDate, freeBoard.viewCount))
//                .from(freeBoard)
//                .fetch();

        //Optional<FindFreeBoardDto> findBoard = freeBoardRepository.findById(freeBoard.getId());

//        System.out.println("findBoard = " + findBoard.get(0));
//        System.out.println("findBoardDto = " + findBoardDto.get(0));
//        Assertions.assertThat(findBoardDto.get(0).getContent()).isEqualTo("테스트 내용");
    }
}