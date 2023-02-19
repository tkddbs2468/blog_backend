package com.sangyoon.blog.board.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sangyoon.blog.board.domain.Board;
import com.sangyoon.blog.board.service.BoardService;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
@RequestMapping("/boards")
public class BoardController {
	
    private final BoardService boardService;

    @GetMapping(value = "")
    public List<Board> findAll() {
        
        return boardService.findAll();
    }

    @PostMapping(value = "")
    public String register() {

        boardService.save(null);
        return "";
    }

    @GetMapping(value="/{id}")
    public String detail(@PathVariable("id") Long id) {
        boardService.get(id);
        
        return "Detail!" + " " + id;
    }

    @PutMapping(value = "/{id}") 
    public String update(@PathVariable("id") Long id) {
        boardService.save(null);
        return "";
    }

    @DeleteMapping(value = "/{id}")
    public String delete(@PathVariable("id") Long id) {
        boardService.delete(id);
        return "";
    }
}