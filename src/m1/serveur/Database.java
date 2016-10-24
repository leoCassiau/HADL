package m1.serveur;

import m2.composants.Composant;

public class Database extends Composant{

	public Database(SecurityManagement sm, QueryInt qi) {
		super( "Database");
		this.add(sm);
		this.add(qi);
	}

}
