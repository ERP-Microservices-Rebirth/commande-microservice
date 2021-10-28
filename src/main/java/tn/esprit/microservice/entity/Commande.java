package tn.esprit.microservice.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Commande {
	@Id
	private String id;

	@Field(value = "date")
	private String date;

	private String etat;
	
	@Field(value = "produit")
	private Produit produit;

	public Commande() {
		super();
	}

	public Commande( String date, String etat, Produit produit) {
		super();
		this.date = date;
		this.etat = etat;
		this.produit = produit;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", date=" + date + ", etat=" + etat + ", produit=" + produit + "]";
	}

	

}
