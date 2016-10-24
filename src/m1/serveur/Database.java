package m1.serveur;

import m2.composants.Composant;

public class Database extends Composant{

	public Database(ServeurDetails c, SecurityManagement sm, QueryInt qi) {
		super(c, "Database");
		this.add(sm);
		this.add(qi);
	}

}
