package m2.connecteurs;

import java.util.ArrayList;
import java.util.List;

import m2.configurations.Configuration;
import m2.configurations.ComposantAbstrait;

public class Connecteur extends ComposantAbstrait {

	protected List<Glue> glues = new ArrayList<Glue>();
	protected List<Role> roles = new ArrayList<Role>();
	
	public Connecteur(Configuration c, String nom, Role r1, Role r2) {
		super(c, nom);
		roles.add(r1);
		roles.add(r2);
	}
	
	public boolean add(Glue e) {
		return glues.add(e);
	}

	public boolean add(Role e) {
		return roles.add(e);
	}

	public boolean remove(Role o) throws Exception {
		if(roles.size() <= 2 ) {
			throw new Exception("Un connecteur a au minimum 2 rôles.");
		} else {
			this.notifyObservers(o);
			return roles.remove(o);
		}
	}
	
	public boolean remove(Glue o) {
		return glues.remove(o);
	}

	
	

	
}
