package m1.serveur;

import m2.configurations.Configuration;

public class ServeurDetails extends Configuration{

	public ServeurDetails(ConnectionManager cm, SecurityManager securitymanager, Database d, 
			ReceiveRequestRequis rrr, ClearenceRequest cr, SQLRequest sqlr, SecurityQuery sq,
			AttachementSecurityManagerClearenceRequest asmcr, AttachementClearenceRequestConnectionManager acrcm,
			AttachementSQLRequestConnectionManager asrcm, AttachementDatabaseSQLRequest adsr,
			AttachementSecurityQueryDatabase asqd, AttachementSecurityManagerSecurityQuery asmsq) {
		super( "ServeurDetails");
		this.ajouterComposantAbstrait(cm);
		this.ajouterComposantAbstrait(securitymanager);
		this.ajouterComposantAbstrait(d);
		this.ajouterComposantAbstrait(rrr);
		this.ajouterComposantAbstrait(cr);
		this.ajouterComposantAbstrait(sqlr);
		this.ajouterComposantAbstrait(sq);
		this.ajouterComposantAbstrait(asmcr);
		this.ajouterComposantAbstrait(acrcm);
		this.ajouterComposantAbstrait(asrcm);
		this.ajouterComposantAbstrait(adsr);
		this.ajouterComposantAbstrait(asqd);
		this.ajouterComposantAbstrait(asmsq);
	}

}
