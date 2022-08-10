package com.salmal.board.board.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Getter
@Entity
@NoArgsConstructor
public class Notice extends Board{


    private String test;
}
