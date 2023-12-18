package com.won15367.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping(value="/BlogHome.naver")
	public String blogHome() {
		return "blogDaemon";
	}
	
	@RequestMapping(value="/board/qna")
	public String qna() {
		return "board/qna";
	}
	
	@RequestMapping(value="/board/question")
	public String question() {
		return "board/question";
	}
	
	@RequestMapping(value="/board/answer")
	public String answer() {
		return "board/answer";
	}

}
