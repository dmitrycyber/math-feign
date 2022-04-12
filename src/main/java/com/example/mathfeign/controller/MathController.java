package com.example.mathfeign.controller;

import com.example.mathfeign.models.Question;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/api")
public interface MathController {

  @GetMapping("/questions")
  List<Question> getRandomQuestion(@RequestParam int amount);
}