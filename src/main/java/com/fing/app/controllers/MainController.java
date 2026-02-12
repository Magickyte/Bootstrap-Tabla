package com.fing.app.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fing.app.models.Usuario;


@Controller
public class MainController {
	
	@GetMapping("/")
	public String inicio(Model model) {
		model.addAttribute("mensaje", "Para ver la pagina use /profile");
		return "index"; 
	}
		  @GetMapping("/profile")
		  public String tabla(Model model) {
			  
			  model.addAttribute("Color", false); //AQUI PARA CAMBIAR EL COLOR DE LA TABLA
			  
			  Usuario user = new Usuario("Angel Rodriguez", "a377043@uach.mx","Ingenieria en Ciencias de la Computacion");
			  
			  model.addAttribute("user", user);
			  
			  return "profile";
		  }
}
