package com.sangyoon.blog.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sangyoon.blog.board.domain.Board;


public interface BoardRepository extends JpaRepository<Board, Long>{
	
}