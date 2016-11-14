package m1.simplecs;

import java.util.Observable;

import m1.binding.BindingServeur;
import m1.serveur.ReceiveRequestRequis;
import m1.serveur.ServeurDetails;
import m2.configurations.ComposantAbstrait;
import m2.configurations.Configuration;
import m2.outils.Requete;

public class SimpleCs extends Configuration{

	public SimpleCs(Client cl, Rpc rpc, Serveur s, BindingServeur bs, ServeurDetails sd, 
			AttachementClientRpc acr, AttachementServeurRpc asr) {
		super( "SimpleCs");
		this.ajouterComposantAbstrait(cl);
		this.ajouterComposantAbstrait(rpc);
		this.ajouterComposantAbstrait(s);
		this.ajouterComposantAbstrait(bs);
		this.ajouterComposantAbstrait(sd);
		this.ajouterComposantAbstrait(acr);
		this.ajouterComposantAbstrait(asr);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		ComposantAbstrait comp = (ComposantAbstrait) arg0;
		Requete requete = (Requete) arg1;


		System.out.println(comp.getNom() + " a reçu la requête suivante : " + requete.getMessage());

		if(!requete.isToken()) { // ALLEZ
			if(comp instanceof SendRequest || comp instanceof RoleCalledRpc || comp instanceof ReceiveRequestFournis || comp instanceof ReceiveRequestRequis){
				rechercheLien(comp).notifyObservers(requete);
			}
			
			else if( comp instanceof RoleCallerRpc) {
				this.rechercheConnecteur(comp).notifyObservers(requete);
			}
		}
		else { // RETOUR
			if( comp instanceof BindingServeur) {
				BindingServeur bsd  = (BindingServeur) comp;
				bsd.getFournis().notifyObservers(requete);
			}
			else if ( comp instanceof ReceiveRequestFournis) {
				rechercheAttachement(comp).notifyObservers(requete);
			}
			else if( comp instanceof RoleCalledRpc) {
				this.rechercheConnecteur(comp).notifyObservers(requete);
			} 
			else if (comp instanceof RoleCallerRpc) {
				rechercheLien(comp).notifyObservers(requete);
			} 
			else if(comp instanceof SendRequest) {
				rechercheComposant(comp).notifyObservers(requete);
			}
			else if (comp instanceof Client) {
				((Client) comp).recevoir(requete);
			}
		}
	}

}
