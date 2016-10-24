package m0.main;

import m1.serveur.*;
import m1.serveur.SecurityManager;
import m1.simplecs.*;
import m1.binding.*;
import m2.outils.InterfaceException;

public class App {

	public static void main(String[] args) {
		
		try{
			// Database
			SecurityManagement sm = new SecurityManagement();
			QueryInt qi = new QueryInt();
			Database d = new Database(sm,qi);
			
			// SecurityManager
			SecurityAuth sa = new SecurityAuth();
			CQuery cq = new CQuery();
			SecurityManager securitymanager = new SecurityManager(sa, cq);
			
			// ConnectionManager
			ExternalSocket es = new ExternalSocket();
			SecurityClock sc = new SecurityClock();
			DbQuery dbq = new DbQuery();
			ConnectionManager cm = new ConnectionManager(es, sc, dbq);
			
			// ClearenceRequest
			RoleCallerClearenceRequest rcallercr = new RoleCallerClearenceRequest();
			RoleCalledClearenceRequest rcalledcr = new RoleCalledClearenceRequest();
			ClearenceRequest cr = new ClearenceRequest(rcalledcr, rcallercr);
			AttachementSecurityManagerClearenceRequest asmcr = new AttachementSecurityManagerClearenceRequest(rcalledcr, sa);
			AttachementClearenceRequestConnectionManager acrcm = new AttachementClearenceRequestConnectionManager(sc, rcallercr);
			
			// SQLRequest
			RoleCallerSQLRequest rcallersr = new RoleCallerSQLRequest();
			RoleCalledSQLRequest rcalledsr = new RoleCalledSQLRequest();
			SQLRequest sr = new SQLRequest(rcalledsr, rcallersr);
			AttachementSQLRequestConnectionManager asrcm = new AttachementSQLRequestConnectionManager(dbq, rcallersr);
			AttachementDatabaseSQLRequest adsr = new AttachementDatabaseSQLRequest(rcalledsr, qi);
			
			// SecurityQuery
			RoleCallerSecurityQuery rcallersq = new RoleCallerSecurityQuery();
			RoleCalledSecurityQuery rcalledsq = new RoleCalledSecurityQuery();
			SecurityQuery sq = new SecurityQuery(rcalledsq, rcallersq);
			AttachementSecurityQueryDatabase asqd = new AttachementSecurityQueryDatabase(sm, rcallersq);
			AttachementSecurityManagerSecurityQuery asmsq = new AttachementSecurityManagerSecurityQuery(rcalledsq, cq);
	
			// ServerDetails
			ReceiveRequestRequis rrr = new ReceiveRequestRequis();
			ServeurDetails sd = new ServeurDetails(cm,securitymanager,d,rrr,cr,sr,sq, asmcr, acrcm, asrcm, adsr, asqd, asmsq);
			
			// Server
			ReceiveRequestFournis rrf = new ReceiveRequestFournis();
			Serveur s = new Serveur(rrf);
			BindingServeur bs = new BindingServeur(rrf, rrr);
			
			// Client
			SendRequest srequest = new SendRequest();
			Client cl = new Client(srequest);
			
			// RPC
			RoleCalledRpc rcalledr = new RoleCalledRpc();
			RoleCallerRpc rcallerr = new RoleCallerRpc();
			Rpc rpc = new Rpc(rcalledr,rcallerr);
			AttachementServeurRpc asr = new AttachementServeurRpc(rcalledr, rrr);
			AttachementClientRpc acr = new AttachementClientRpc(srequest, rcallerr);
			
			// SimpleCS
			SimpleCs simplecs = new SimpleCs(cl, rpc, s, bs, sd, acr, asr);
			
		} catch(InterfaceException e) {
			e.printStackTrace();
		}
		
		
	}

}
