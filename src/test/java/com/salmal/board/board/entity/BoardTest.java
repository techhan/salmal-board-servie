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
import java.util.stream.Collectors;

import static com.salmal.board.board.entity.QBoard.*;
import static com.salmal.board.board.entity.QFreeBoard.freeBoard;
import static org.assertj.core.api.Assertions.*;

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

         // C
        FreeBoard freeBoard = new FreeBoard("테스트 제목", "테스트 내용", BoardStatus.CREATED, BoardType.FREE_BOARD);
        em.persist(freeBoard);


    }


    @Test
    public void find() {

        FreeBoard freeBoard2 = new FreeBoard("테스트 제목2", "테스트 내용2", BoardStatus.CREATED, BoardType.FREE_BOARD);
        em.persist(freeBoard2);

        em.flush();
        em.clear();

        //R(dto로 바로 조회) - 영속성 컨텍스트에서 관리 X
        List<FindFreeBoardDto> findBoardDto = jpaQueryFactory
                .select(new QFindFreeBoardDto(freeBoard.id, freeBoard.title, freeBoard.content,
                        freeBoard.type, freeBoard.status, freeBoard.createdDate, freeBoard.viewCount))
                .from(freeBoard)
                .fetch();

        System.out.println("findBoardDto = " + findBoardDto.get(0));
        assertThat(findBoardDto.get(0).getContent()).isEqualTo("테스트 내용");


        // R(엔티티로 조회 후 DTO로 변환)
        List<FreeBoard> findBoardEntityList = jpaQueryFactory
                .selectFrom(freeBoard)
                        .fetch();

        List<FindFreeBoardDto> findBoardChangeDto = findBoardEntityList.stream()
                .map(f -> new FindFreeBoardDto(f))
                .collect(Collectors.toList());


        System.out.println("========================== 수정 ========================");

        findBoardEntityList.get(0).updateFreeBoard("수정된 제목 테스트", "수정된 내용 테스트");

        // D
        long result = jpaQueryFactory
                .delete(freeBoard)
                .where(freeBoard.id.eq(freeBoard2.getId()))
                .execute();

        System.out.println("result = " + result);

        em.flush();
        em.clear();


        assertThat(result).isEqualTo(1);

    }
}