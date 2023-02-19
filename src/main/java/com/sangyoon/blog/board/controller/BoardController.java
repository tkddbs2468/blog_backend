package com.sangyoon.blog.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
public class BoardController {
	
    @GetMapping(value="/{id}")
    public String detail(@PathVariable("id") String id) {
        
        
        return "Detail!" + " " + id;
    }
}