package m2.configurations;

import java.util.Observable;

public abstract class ComposantAbstrait extends Observable {

	protected String nom;
	
	public ComposantAbstrait(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}

