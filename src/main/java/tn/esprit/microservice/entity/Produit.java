package tn.esprit.microservice.entity;




public class Produit {
	
	private String id;

	
	private String nom_produit;

	private String image;
	
	private String description;

	
	private double PrixActuel;
	
	
	private boolean disponible;


	private int quantite;

	public Produit( String nom_produit, String image, String description, double prixActuel,
			boolean disponible, int quantite) {
		super();
		this.nom_produit = nom_produit;
		this.image = image;
		this.description = description;
		PrixActuel = prixActuel;
		this.disponible = disponible;
		this.quantite = quantite;
	}

	public Produit() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom_produit() {
		return nom_produit;
	}

	public void setNom_produit(String nom_produit) {
		this.nom_produit = nom_produit;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrixActuel() {
		return PrixActuel;
	}

	public void setPrixActuel(double prixActuel) {
		PrixActuel = prixActuel;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom_produit=" + nom_produit + ", image=" + image + ", description="
				+ description + ", PrixActuel=" + PrixActuel + ", disponible=" + disponible + ", quantite=" + quantite
				+ "]";
	}

	public Produit(String nom_produit, String description, double prixActuel, boolean disponible, int quantite) {
		super();
		this.nom_produit = nom_produit;
		this.description = description;
		PrixActuel = prixActuel;
		this.disponible = disponible;
		this.quantite = quantite;
	}
	
	
}
