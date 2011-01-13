package com.grafi.glaliste;

//This class define an item through its name, its category and a photography

public class element {
	
//attributs
	private String nom; //Name of the item
	private String categorie; //Category to which the item belongs
	private String photo; //Name of the file in which the item's photography is saved

	
//getters and setters	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
//Constructeur
	public element(String nom, String categorie, String photo){
		this.nom=nom;
		this.categorie=categorie;
		this.photo=photo;
	}
	

}
