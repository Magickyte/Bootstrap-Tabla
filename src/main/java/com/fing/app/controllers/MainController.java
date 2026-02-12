package com.fing.app.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
	
	@GetMapping("/")
	public String inicio(Model model) {
		model.addAttribute("mensaje", "Para ver la pagina use /profile");
		return "index"; 
	}
		  @GetMapping("/profile")
		  public String tabla(Model model) {
			  return profile;
		  }
}
