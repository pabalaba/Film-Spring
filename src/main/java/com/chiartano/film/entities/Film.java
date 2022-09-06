package com.chiartano.film.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "film")
public class Film {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titolo;
	private String descrizione;
	private int durata;
	private int annoPubblicazione;
	private String regista;
	private String attori;
	private String generi;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public int getAnnoPubblicazione() {
		return annoPubblicazione;
	}
	public void setAnnoPubblicazione(int anno_pubblicazione) {
		this.annoPubblicazione = anno_pubblicazione;
	}
	public String getRegista() {
		return regista;
	}
	public void setRegista(String regista) {
		this.regista = regista;
	}
	public String getAttori() {
		return attori;
	}
	public void setAttori(String attori) {
		this.attori = attori;
	}
	public String getGeneri() {
		return generi;
	}
	public void setGeneri(String generi) {
		this.generi = generi;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Film [id=");
		builder.append(id);
		builder.append(", titolo=");
		builder.append(titolo);
		builder.append(", descrizione=");
		builder.append(descrizione);
		builder.append(", durata=");
		builder.append(durata);
		builder.append(", annoPubblicazione=");
		builder.append(annoPubblicazione);
		builder.append(", regista=");
		builder.append(regista);
		builder.append(", attori=");
		builder.append(attori);
		builder.append(", classificazioni=");
		builder.append(generi);
		builder.append("]");
		return builder.toString();
	}
	
	
}
