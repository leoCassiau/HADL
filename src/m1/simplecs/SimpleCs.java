package m1.simplecs;

import java.util.Observable;

import m1.binding.BindingServeur;
import m1.serveur.ServeurDetails;
import m2.composants.Composant;
import m2.configurations.ComposantAbstrait;
import m2.configurations.Configuration;
import m2.configurations.Interface;
import m2.configurations.Lien;
import m2.connecteurs.Connecteur;

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
		if(arg0 instanceof Composant || arg0 instanceof Connecteur) {
			Composant comp = (Composant) arg0;
				for(ComposantAbstrait e : this.elements) {
					if(e instanceof Lien ) {
						Lien l = (Lien) e;
						if(comp.contains(l.getFournis())) {
							l.getRequis().notifyObservers(arg1);
						} 
						else if(comp.contains(l.getRequis())) {
							l.getFournis().notifyObservers(arg1);
						}
					}
				}
		}
		else if(arg0 instanceof Interface) {
			for(ComposantAbstrait e : this.elements) {
				if(e instanceof Composant) {
					Composant c = (Composant) e;
					if(c.contains(arg0)) {
						c.notifyObservers(arg1);
					}
				}
			}
		}
	}
}
