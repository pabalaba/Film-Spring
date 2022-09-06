package com.chiartano.film.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.chiartano.film.entities.Film;

@Service
public interface FilmService {
	
	
	//CRUD
	//Create
	Film createOne(Film film);
	//Read
	List<Film> getAll();
	Film getOneById(int id);
	//Update
	Film updateOne(int id,Film film);
	//Delete
	void deleteOneById(int id);
}
