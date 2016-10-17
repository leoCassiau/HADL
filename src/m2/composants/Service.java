package m2.composants;

import java.util.ArrayList;
import java.util.List;

import m2.outils.InterfaceException;

public class Service extends InterfaceComposant {
	
	private List<InterfaceComposant> accede = new ArrayList<InterfaceComposant>();

	public Service(String nom, boolean fournis) {
		super(nom, fournis);
	}
	
	public boolean add(InterfaceComposant e) throws InterfaceException {
		if(this.fournis == e.estFournis()) {
			return accede.add(e);
		} else {
			throw new InterfaceException(e.getNom(), fournis);
		}
	}

	public boolean remove(InterfaceComposant o) {
		return accede.remove(o);
	}

}
