package m2.connecteurs;

import java.util.ArrayList;
import java.util.List;

import m2.configurations.ComposantAbstrait;

public class Connecteur extends ComposantAbstrait {

	protected List<Glue> glues = new ArrayList<Glue>();
	protected List<Role> roles = new ArrayList<Role>();


	public List<Role> getRoles() {
		return roles;
	}

	public Connecteur( String nom, Role r1, Role r2) {
		super(nom);
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
			return roles.remove(o);
		}
	}
	
	public boolean remove(Glue o) {
		return glues.remove(o);
	}
	
	public boolean contains(Object o) {
		return roles.contains(o);
	}
	
	
}
