package m1.simplecs;

import java.util.Observable;
import java.util.Observer;

import m1.binding.BindingServeur;
import m1.serveur.ServeurDetails;
import m2.composants.Composant;
import m2.configurations.ComposantAbstrait;
import m2.configurations.Configuration;
import m2.configurations.Interface;
import m2.configurations.Lien;
import m2.connecteurs.Connecteur;
import m2.connecteurs.Role;

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

	public ComposantAbstrait rechercheLien(ComposantAbstrait comp) {
		
		for(ComposantAbstrait c : this.elements) {
			if(c instanceof Lien) {
				Lien l = (Lien) c;
				if(l.getFournis().equals(comp)) {
					return l.getRequis(); 
				} else if (l.getRequis().equals(comp)){
					return l.getFournis();
				}
			}
		}
		return null;
	}
	
	public ComposantAbstrait rechercheConnecteur(ComposantAbstrait comp) {
		
		
		return null;
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		ComposantAbstrait comp = (ComposantAbstrait) arg0;
		String message = (String) arg1;
		
		System.out.println(comp.getNom() + " a reçu la requête suivante : " + message);
		if(comp instanceof SendRequest || comp instanceof RoleCalledRpc){
			rechercheLien(comp).notifyObservers(message);
		}
		
		
		else if( comp instanceof RoleCallerRpc) {
			
			
			
			
			for(ComposantAbstrait c : this.elements) {
				if(c instanceof Connecteur) {
					Connecteur l = (Connecteur) c;
					if(l.getRoles().contains(comp)) {
						for(Role r : l.getRoles()) {
							if(!r.equals(comp)) {
								r.notifyObservers(message);
							}
						}
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
	}
}
