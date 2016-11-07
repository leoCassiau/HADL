package m2.composants;

import java.util.ArrayList;
import java.util.List;

import m2.configurations.ComposantAbstrait;

public class Composant extends ComposantAbstrait {

	protected List<InterfaceComposant> interfaces = new ArrayList<InterfaceComposant>();

	public Composant(String nom) {
		super( nom);
	}

	public boolean add(InterfaceComposant e) {
		return interfaces.add(e);
	}

	public boolean remove(InterfaceComposant o) {
		return interfaces.remove(o);
	}

	public int sizeInterfaces() {
		return interfaces.size();
	}
	
	public boolean contains(Object arg0) {
		return interfaces.contains(arg0);
	}

	public List<InterfaceComposant> getInterfaces() {
		return interfaces;
	}

	
	
}
