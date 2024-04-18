package com.anilgupta001.Controller;

import org.hibernate.query.NativeQuery.ReturnableResultNode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	@GetMapping
public String name() {
	return "Working";
}
}
