package com.grafi.glaliste;

import java.util.ArrayList;

//This class define a list of elements.
//A list of element will be used in order to add, save and remove elements both from the shopping basket 'panier' and the shop 'magasin'


public class liste {

//Attributs
	private ArrayList<element> liste;

//Constructeur
	public liste(){
		this.liste = new ArrayList();
	}
	
//Methods

	//Get an item from the list
	public element getElement(int i) {
			return this.liste.get(i);
	}

	//Add a new element to the list
	public void addElement(element e){
		this.liste.add(e);
	}
	
	//Suppress an element from the list
	public void suppElement(element e){
		boolean b=false;
		int k=0;
		while(b==false){
			for (int i=0; i<this.liste.size(); i++){
				element E=this.liste.get(i);
				if(E.getNom()==e.getNom() && E.getPhoto()==e.getPhoto() && E.getCategorie()==e.getCategorie()){
					b=true;
					k=i;
				}
			
			}

		}
		this.liste.remove(k);
	}
}
	
