package com.fing.app.controllers;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.fing.app.models.Usuario;


@Controller
public class MainController {
	
	@GetMapping("/")
	public String inicio(Model model) {
		model.addAttribute("mensaje", "Para ver las tablas porfavor ingrese una de estos parametros: /profile/true o /profile/false");
		return "index"; 
	}
		  @GetMapping("/profile/{modo}")
		  public String tabla(Model model, @PathVariable boolean modo) {
			  
			  model.addAttribute("Color", modo); //AQUI PARA CAMBIAR EL COLOR DE LA TABLA
			  
			  
			  List<String> pasteles = new ArrayList<>();
			  
			  pasteles.add("Chocolate");
			  pasteles.add("Velvet");
			  pasteles.add("Zanahoria");
			  pasteles.add("Vainilla");
			  pasteles.add("Queso");
			  pasteles.add("Fresa");
			  pasteles.add("Coco");
			  pasteles.add("Limon");
			  pasteles.add("Oreo"); 
			  pasteles.add("Dulce");
			  Usuario user = new Usuario("Angel Rodriguez Palomino", "a377043@uach.mx","Ingenieria en Ciencias de la Computacion");
			
			  model.addAttribute("user", user);
			  
			 model.addAttribute("pasteles", pasteles);
			  
			  return "profile";
		  }
}
