package com.chiartano.film.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chiartano.film.entities.Film;

@Repository
public interface FilmDAO extends JpaRepository<Film, Integer>{

}
