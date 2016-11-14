package m1.serveur;

import java.util.Observable;

import m1.binding.BindingServerDetails;
import m1.binding.BindingServeur;
import m2.configurations.ComposantAbstrait;
import m2.configurations.Configuration;
import m2.outils.Requete;

public class ServeurDetails extends Configuration{

	public ServeurDetails(ConnectionManager cm, SecurityManager securitymanager, Database d, 
			ReceiveRequestRequis rrr, ClearenceRequest cr, SQLRequest sqlr, SecurityQuery sq,
			AttachementSecurityManagerClearenceRequest asmcr, AttachementClearenceRequestConnectionManager acrcm,
			AttachementSQLRequestConnectionManager asrcm, AttachementDatabaseSQLRequest adsr,
			AttachementSecurityQueryDatabase asqd, AttachementSecurityManagerSecurityQuery asmsq, BindingServerDetails bsd, BindingServeur bs) {
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
		this.ajouterComposantAbstrait(bsd);
		this.ajouterComposantAbstrait(bs);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		ComposantAbstrait comp = (ComposantAbstrait) arg0;
		Requete requete = (Requete) arg1;
		
		System.out.println(comp.getNom() + " a reçu la requête suivante : " + requete.getMessage());
		if(!requete.isToken()) { // A LALLER
			if(comp instanceof ReceiveRequestRequis || comp instanceof SecurityClock || comp instanceof RoleCalledClearenceRequest || 
					comp instanceof CQuery || comp instanceof RoleCallerSecurityQuery ){
				rechercheLien(comp).notifyObservers(requete);
			}
		
			else if( comp instanceof ExternalSocket || comp instanceof SecurityAuth || comp instanceof SecurityManagement) {
				this.rechercheComposant(comp).notifyObservers(requete);
			}
			
			else if(comp instanceof RoleCallerClearenceRequest || comp instanceof RoleCalledSecurityQuery) {
				this.rechercheConnecteur(comp).notifyObservers(requete);
			}
			
			else if(comp instanceof ConnectionManager) {
				((ConnectionManager) comp).getSecurityClock().notifyObservers(requete);
			}
			
			else if(comp instanceof SecurityManager) {
				((SecurityManager) comp).recevoir(requete);
				((SecurityManager) comp).getCQuery().notifyObservers(requete);
			}
			
			else if(comp instanceof Database) {
				((Database) comp).recevoir(requete);
				((Database) comp).getQueryInt().notifyObservers(requete);
			}
		}
		
		else { // AU RETOUR
			if(comp instanceof QueryInt || comp instanceof RoleCallerSQLRequest || comp instanceof ExternalSocket ){
				rechercheLien(comp).notifyObservers(requete);
			} 
			else if (comp instanceof RoleCalledSQLRequest) {
				this.rechercheConnecteur(comp).notifyObservers(requete);
			}
			else if(comp instanceof DbQuery) {
				this.rechercheComposant(comp).notifyObservers(requete);
			}
			else if(comp instanceof ConnectionManager) {
				((ConnectionManager) comp).getExternalSocket().notifyObservers(requete);
			}
			else if(comp instanceof ReceiveRequestRequis) {
				this.elements.get(14).notifyObservers(requete);
			}
		}
	}
}
