package com.restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.dto.Users;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class HomeController {

	@GetMapping("/users")
	public String getUsers() {
		return "helloooo";
	}

	@GetMapping("/mark")
	public int addMark(@RequestParam("a") int op1, @RequestParam("b") int op2) {
		return op1 + op2;
	}

	@GetMapping("/mark1")
	public int addMark1(@RequestParam("a") int op1, @RequestParam("b") int op2) {
		return op1 + op2;
	}

	@GetMapping("/mark2/{a}/{b}")
	public int addMark2(@PathVariable("a") int op1, @PathVariable("b") int op2) {
		return op1 + op2;
	}

	@PostMapping("/save")
	public String saveUserData(@RequestBody Users users) {
		if (users.getUserName().equals("Saravana")) {
			return "Valid user name";
		}
		
            return "invalid user name";

	}

}
