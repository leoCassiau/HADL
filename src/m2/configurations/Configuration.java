package m2.configurations;

import java.util.ArrayList;
import java.util.List;

public class Configuration extends ComposantAbstrait {
	
	private List<ComposantAbstrait> elements = new ArrayList<ComposantAbstrait>();

	public Configuration(String nom) {
		super(nom);
	}

	public void ajouterComposantAbstrait(ComposantAbstrait e) {
		elements.add(e);
	}
	
	public ComposantAbstrait getComposantAbstrait(int index){
		return elements.get(index);
	}
	
	public void supprimerComposantAbstrait(ComposantAbstrait e) {
		elements.remove(e);
	}
}
