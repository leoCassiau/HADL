package m2.configurations;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import m2.composants.Composant;
import m2.configurations.Configuration;
import m2.connecteurs.Connecteur;
import m2.connecteurs.Role;

public abstract class Configuration extends ComposantAbstrait implements Observer {
	
	protected List<ComposantAbstrait> elements = new ArrayList<ComposantAbstrait>();

	public Configuration(String nom) {
		super(nom);
	}

	protected void ajouterComposantAbstrait(ComposantAbstrait e) {
		elements.add(e);
		e.addObserver(this);

		if(e instanceof Composant){
			Composant comp = (Composant) e;
			for(Interface p : comp.getInterfaces()){
				p.addObserver(this);
			}
		}
		else if(e instanceof Connecteur){
			Connecteur con = (Connecteur) e;
			for(Interface p : con.getRoles()){
				p.addObserver(this);
			}
		}
	}
	
	public ComposantAbstrait getComposantAbstrait(int index){
		return elements.get(index);
	}
	
	public void supprimerComposantAbstrait(ComposantAbstrait e) {
		elements.remove(e);
		e.deleteObserver(this);
	}

	public ComposantAbstrait rechercheLien(ComposantAbstrait comp) {
		
		for(ComposantAbstrait c : this.elements) {
			if(c instanceof Lien) {
				Lien l = (Lien) c;
				if(l.getFournis().equals(comp)) {
					return l.getRequis(); 
					
				} else if (l.getRequis().equals(comp)){
					return l.getFournis();
				}
			}
		}
		return null;
	}
	
	public ComposantAbstrait rechercheAttachement(ComposantAbstrait comp) {
		
		for(ComposantAbstrait c : this.elements) {
			if(c instanceof Attachement) {
				Attachement l = (Attachement) c;
				if(l.getFournis().equals(comp)) {
					return l.getRequis(); 
					
				} else if (l.getRequis().equals(comp)){
					return l.getFournis();
				}
			}
		}
		return null;
	}
	
	public ComposantAbstrait rechercheConnecteur(ComposantAbstrait comp) {
		for(ComposantAbstrait c : this.elements) {
			if(c instanceof Connecteur) {
				Connecteur l = (Connecteur) c;
				if(l.getRoles().contains(comp)) {
					for(Role r : l.getRoles()) {
						if(!r.equals(comp)) {
							return r;
						}
					}
				}
			}
		}
		return null;
	}
	
	public ComposantAbstrait rechercheComposant(ComposantAbstrait comp) {
		for(ComposantAbstrait c : this.elements) {
			if(c instanceof Composant) {
				Composant l = (Composant) c;
				if(l.getInterfaces().contains(comp)) {
					return l;
				}
			}
		}
		return null;
	}

	@Override
	public abstract void update(Observable o, Object arg);
	
}
