package com.example.demo.checker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;






@Controller
public class RestfulSources {
	
	
	@RequestMapping("/console")
	public String index () {
	    
	    return "/home";
	}
	

	

}
