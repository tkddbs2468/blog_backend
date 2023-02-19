package com.sangyoon.blog.board.domain;

import java.sql.Timestamp;

import com.sangyoon.blog.common.domain.BaseDomain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Board extends BaseDomain{
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(nullable = false)
    private String title;
    
    @Column
    private String description;

    @Column
    private int viewCnt;
}