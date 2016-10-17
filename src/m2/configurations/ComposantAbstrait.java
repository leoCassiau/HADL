package m2.configurations;

public abstract class ComposantAbstrait {

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

