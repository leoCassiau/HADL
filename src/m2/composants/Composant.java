package m2.composants;

import java.util.ArrayList;
import java.util.List;

import m2.configurations.ComposantAbstrait;
import m2.configurations.Configuration;

public class Composant extends ComposantAbstrait {

	private List<InterfaceComposant> interfaces = new ArrayList<InterfaceComposant>();

	public Composant(Configuration c, String nom) {
		super(c, nom);
	}

	public boolean add(InterfaceComposant e) {
		return interfaces.add(e);
	}

	public boolean remove(InterfaceComposant o) {
		return interfaces.remove(o);
	}

	
}
