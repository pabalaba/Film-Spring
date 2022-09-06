package com.chiartano.film.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chiartano.film.services.FilmService;


@Controller
@RequestMapping("mvc")
public class FilmMVC {
	
	@Autowired
	public FilmService service;
	
	@GetMapping("films") 
	public String getAll(Model m) {	
		m.addAttribute("titolo", "Tutti i film");
		m.addAttribute("lista", service.getAll());
		return "elenco";
	}
	
	@GetMapping("films/{id}")
	public String getOne(Model m,@PathVariable int id) {	
		m.addAttribute("titolo", "Singolo film");
		m.addAttribute("film", service.getOneById(id));
		return "singolo";
	}
	
}
