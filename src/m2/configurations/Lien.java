package m2.configurations;

import m2.outils.InterfaceException;

public abstract class Lien extends ComposantAbstrait {

	protected Interface fournis;
	protected Interface requis;
	
	public Lien(String nom, Interface fournis, Interface requis) throws InterfaceException {
		super(nom);
		setFournis(fournis);
		setRequis(requis);
	}

	public Interface getFournis() {
		return fournis;
	}

	public void setFournis(Interface fournis) throws InterfaceException{
		if(fournis.estFournis()) {
			this.fournis = fournis;
		} else {
			throw new InterfaceException(fournis.getNom(), true);
		}
	}

	public Interface getRequis() {
		return requis;
	}

	public void setRequis(Interface requis) throws InterfaceException {
		if(requis.estRequis()) {
			this.requis = requis;
		}else {
			throw new InterfaceException(requis.getNom(), false);
		}
	}

}
