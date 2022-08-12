package com.salmal.board.board.repository;

import com.salmal.board.board.dto.FindFreeBoardDto;
import com.salmal.board.board.entity.FreeBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FreeBoardRepository extends JpaRepository<FreeBoard, Long> {

}
