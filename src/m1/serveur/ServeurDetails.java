package m1.serveur;

import m2.configurations.Configuration;

public class ServeurDetails extends Configuration{

	public ServeurDetails(Configuration c, ConnectionManager cm, SecurityManagement sm, Database d, 
			ReceiveRequestRequis rrr, ClearenceRequest cr, SQLRequest sqlr, SecurityQuery sq) {
		super(c, "ServeurDetails");
		this.ajouterComposantAbstrait(cm);
		this.ajouterComposantAbstrait(sm);
		this.ajouterComposantAbstrait(d);
		this.ajouterComposantAbstrait(rrr);
		this.ajouterComposantAbstrait(cr);
		this.ajouterComposantAbstrait(sqlr);
		this.ajouterComposantAbstrait(sq);
	}

}
