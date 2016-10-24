package m1.simplecs;

import m1.binding.BindingServeur;
import m1.serveur.ServeurDetails;
import m2.configurations.Configuration;

public class SimpleCs extends Configuration{
	
	public SimpleCs(Configuration c, Client cl, Rpc rpc, Serveur s, BindingServeur bs, ServeurDetails sd, 
			AttachementClientRpc acr, AttachementServeurRpc asr) {
		super(c, "SimpleCs");
		this.ajouterComposantAbstrait(cl);
		this.ajouterComposantAbstrait(rpc);
		this.ajouterComposantAbstrait(s);
		this.ajouterComposantAbstrait(bs);
		this.ajouterComposantAbstrait(sd);
		this.ajouterComposantAbstrait(acr);
		this.ajouterComposantAbstrait(asr);
	}

}
