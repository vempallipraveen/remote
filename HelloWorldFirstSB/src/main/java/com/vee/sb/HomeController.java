package com.vee.sb;

import org.springframework.stereotype.Controller;
import org.springframework.web.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController  
public class HomeController {
//	@RequestMapping(value = "/hello", method = "GET")
	@RequestMapping ("/hello")
	public String hello() {
		return "First Spring Program. Say Hello!";
	}

}
