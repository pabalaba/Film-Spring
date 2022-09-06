package com.chiartano.film.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chiartano.film.entities.Film;
import com.chiartano.film.services.FilmService;

@RestController
@RequestMapping("api")
public class FilmRest {
	
	@Autowired
	private FilmService service;
	
	@GetMapping("films")
	public List<Film> getAll(){
		return service.getAll();
	}
	
	@GetMapping("films/{id}")
	public Film getOneById(@PathVariable int id) {
		return service.getOneById(id);
	}
	
	@PostMapping("films")
	public Film createOne(@RequestBody Film film) {
		return service.createOne(film);
	}
	
	@PutMapping("films/{id}")
	public Film updateOne(@PathVariable int id,@RequestBody Film film) {
		return service.updateOne(id, film);
	}
	
	@DeleteMapping("films/{id}")
	public void deleteOneById(@PathVariable int id) {
		service.deleteOneById(id);
	}
}
