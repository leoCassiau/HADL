package m1.serveur;

import m2.configurations.Attachement;
import m2.outils.InterfaceException;

public class AttachementSecurityManagerSecurityQuery extends Attachement{

	public AttachementSecurityManagerSecurityQuery(RoleCalledSecurityQuery fournis, CQuery requis) throws InterfaceException {
		super( "AttachementSecurityManagerSecurityQuery", fournis, requis);
	}



}
