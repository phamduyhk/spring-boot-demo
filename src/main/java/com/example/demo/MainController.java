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
		System.out.println("input1メソッドを実行します。");
		return "test-abc";
	}
	@GetMapping("/test2")
	public String input2() {
		System.out.println("input2メソッドを実行します。");
		return "test2";
	}
	
	@GetMapping("/test-jpa")
	public List<Member> get(){
		System.out.println("getメソッドを実行します。");
		return memberRepository.findAll();
	}
}
