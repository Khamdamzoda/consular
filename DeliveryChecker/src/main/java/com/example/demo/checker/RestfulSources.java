package com.example.demo.checker;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.*; 





@Controller
public class RestfulSources {
	






	
	
@RequestMapping("/console")
public String index () {
		

    
    return "/home";
	}
	


@RequestMapping("/search")
public String search() throws IOException {

	GetDocument.search();

return "home" ; 

}

}
