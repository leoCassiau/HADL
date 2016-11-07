package m2.configurations;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import m2.composants.Composant;
import m2.configurations.Configuration;
import m2.connecteurs.Connecteur;

public class Configuration extends ComposantAbstrait implements Observer {
	
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

	@Override
	public void update(Observable arg0, Object arg1) {

		/*
		Requete req = (Requete) arg1;
		if(req.contains(arg0)) { // Si la requête est déjà passé par ce composant.
			return;
		}
		
		if(arg0 instanceof Composant) {
			Composant comp = (Composant) arg0;
			for(ComposantAbstrait e : this.elements) {
				if(e instanceof Lien ) {
					Lien l = (Lien) e;
					if(comp.contains(l.getFournis())) {
						l.getRequis().notifyObservers(arg1);
					} 
					else if(comp.contains(l.getRequis())) {
						l.getFournis().notifyObservers(arg1);
					}
				}
			}
		}
		else if(arg0 instanceof Interface) {
			for(ComposantAbstrait e : this.elements) {
				if(e instanceof Composant) {
					Composant c = (Composant) e;
					if(c.contains(arg0)) {
						c.notifyObservers(arg1);
					}
				}
			}
		}*/
		
	}

}
