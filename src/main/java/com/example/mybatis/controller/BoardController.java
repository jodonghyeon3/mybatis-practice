package com.example.mybatis.controller;

import com.example.mybatis.service.BoardService;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
@NoArgsConstructor
public class BoardController {

  private final BoardService boardService;

  //생성

  //조회
  @GetMapping("/list")
  public String
}
