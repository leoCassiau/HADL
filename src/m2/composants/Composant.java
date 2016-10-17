package m2.composants;

import java.util.List;

import m2.configurations.ComposantAbstrait;

public class Composant extends ComposantAbstrait {

	private List<InterfaceComposant> interfaces;

	public Composant(String nom) {
		super(nom);
	}

	public boolean add(InterfaceComposant e) {
		return interfaces.add(e);
	}

	public boolean remove(InterfaceComposant o) {
		return interfaces.remove(o);
	}

	
}
