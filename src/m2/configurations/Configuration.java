package m2.configurations;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import m2.configurations.Configuration;

public class Configuration extends ComposantAbstrait implements Observer {
	
	protected List<ComposantAbstrait> elements = new ArrayList<ComposantAbstrait>();

	public Configuration(String nom) {
		super(nom);
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
		e.deleteObserver(this);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

}
