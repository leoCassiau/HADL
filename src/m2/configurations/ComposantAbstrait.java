package m2.configurations;

import java.util.Observable;

public abstract class ComposantAbstrait extends Observable {

	protected String nom;
	
	public ComposantAbstrait(Configuration c, String nom) {
		this.nom = nom;
		this.addObserver(c);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
}

