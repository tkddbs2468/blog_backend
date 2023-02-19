package com.sangyoon.blog.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sangyoon.blog.board.domain.Board;
import com.sangyoon.blog.board.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardService {
	
    private final BoardRepository boardRepository;

    public Board save(Board board) {
        boardRepository.save(board);
        return board;
    }

    public Board get(Long id) {
        return boardRepository.getReferenceById(id);
    }

    public List<Board> findAll() {
        return boardRepository.findAll();
    }

    public void delete(Long id) {
        boardRepository.deleteById(id);
    }
}