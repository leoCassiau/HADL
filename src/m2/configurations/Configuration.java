package m2.configurations;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import m2.configurations.Configuration;
import m2.connecteurs.Connecteur;

public class Configuration extends ComposantAbstrait implements Observer {
	
	private List<ComposantAbstrait> elements = new ArrayList<ComposantAbstrait>();

	public Configuration(Configuration c, String nom) {
		super(c, nom);
	}

	protected void ajouterComposantAbstrait(ComposantAbstrait e) {
		elements.add(e);
		e.addObserver(this);
	}
	
	public ComposantAbstrait getComposantAbstrait(int index){
		return elements.get(index);
	}
	
	public void supprimerComposantAbstrait(ComposantAbstrait e) {
		elements.remove(e);
		e.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Connecteur) {
			elements.remove(arg);
		}
	}
}
