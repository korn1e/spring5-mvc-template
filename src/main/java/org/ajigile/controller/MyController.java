package org.ajigile.controller;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	
	@GetMapping("/ajigile")
	public String ajigile(Model model) {
		
		//Log in console that your request has been handled by this controller/handler
		System.out.println("...................AJIGILE...!!!"); 
		// I know, I know...just to make this template as minimum as possible for beginners.
		
		
		List<String> list = Stream.of(new String[] {"item1", "item2", "item3"}).collect(Collectors.toList());
		//String[] list = new String[] {"item1", "item2", "item3"};  // you can use this also
		
		model.addAttribute("myName", "SI KAMPRET");
		model.addAttribute("wishlist", list); 
		
		
		return "ajigileview";
	}

}
