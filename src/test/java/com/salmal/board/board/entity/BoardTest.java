package com.salmal.board.board.entity;

import com.salmal.board.board.entity.Board;
import com.salmal.board.board.repository.BoardRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootTest
@Transactional
class BoardTest {

    @Autowired
    EntityManager em;

    @Autowired
    BoardRepository boardRepository;

    @BeforeEach
    public void beforeEach() {
        //String title, String content, BoardStatus status, BoardType type
        //Board board = new Board("테스트 제목");
    }
}