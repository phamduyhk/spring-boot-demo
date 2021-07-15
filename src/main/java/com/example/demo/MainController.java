package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@Autowired
	private MemberRepository memberRepository;
	
	@GetMapping("/test1")
	public String input1() {
		return "test1";
	}
	@GetMapping("/test2")
	public String input2() {
		return "test2";
	}
	
	@GetMapping("/test-jpa")
	public List<Member> get(){
		return memberRepository.findAll();
	}
}
