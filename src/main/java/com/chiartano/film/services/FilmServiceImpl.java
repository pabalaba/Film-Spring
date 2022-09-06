package com.chiartano.film.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chiartano.film.dao.FilmDAO;
import com.chiartano.film.entities.Film;

@Service
public class FilmServiceImpl implements FilmService {

	@Autowired
	private FilmDAO repo;
	
	@Override
	public Film createOne(Film film) {
		return repo.save(film);
	}

	@Override
	public List<Film> getAll() {
		return repo.findAll();
	}
	
	@Override
	public Film getOneById(int id) {
		Film film = null;
		try {
			film = repo.findById(id).get();
		}catch (Exception e) {
			// TODO: handle exception
		}
		return film;
	}

	@Override
	public Film updateOne(int id, Film film) {
		Film filmFromDB = repo.findById(id).get();
		if(filmFromDB==null)
			return null;
		filmFromDB.setTitolo(film.getTitolo());
		filmFromDB.setDescrizione(film.getDescrizione());
		filmFromDB.setDurata(film.getDurata());
		filmFromDB.setAnnoPubblicazione(film.getAnnoPubblicazione());
		filmFromDB.setAttori(film.getAttori());
		filmFromDB.setGeneri(film.getGeneri());
		filmFromDB.setRegista(film.getRegista());
		return repo.save(filmFromDB);
	}

	@Override
	public void deleteOneById(int id) {
		repo.deleteById(id);
	}

}
