package m0.main;

import m1.serveur.*;
import m1.serveur.SecurityManager;
import m1.simplecs.*;
import m1.binding.*;

public class App {

	public static void main(String[] args) {
		
		// Database
		SecurityManagement sm = new SecurityManagement(c);
		QueryInt qi = new QueryInt(c);
		Database d = new Database(c,sm,qi);
		
		// SecurityManager
		SecurityAuth sa = new SecurityAuth(c);
		CQuery cq = new CQuery(c);
		SecurityManager securitymanager = new SecurityManager(c, sa, cq);
		
		// ConnectionManager
		ExternalSocket es = new ExternalSocket(c);
		SecurityClock sc = new SecurityClock(c);
		DbQuery dbq = new DbQuery(c);
		ConnectionManager cm = new ConnectionManager(c, es, sc, dbq);
		
		// ClearenceRequest
		RoleCallerClearenceRequest rcallercr = new RoleCallerClearenceRequest(c);
		RoleCalledClearenceRequest rcalledcr = new RoleCalledClearenceRequest(c);
		ClearenceRequest cr = new ClearenceRequest(c, rcalledcr, rcallercr);
		AttachementSecurityManagerClearenceRequest asmcr = new AttachementSecurityManagerClearenceRequest(c, rcalledcr, sa);
		AttachementClearenceRequestConnectionManager acrcm = new AttachementClearenceRequestConnectionManager(c, sc, rcallercr);
		
		// SQLRequest
		RoleCallerSQLRequest rcallersr = new RoleCallerSQLRequest(c);
		RoleCalledSQLRequest rcalledsr = new RoleCalledSQLRequest(c);
		SQLRequest sr = new SQLRequest(c, rcalledsr, rcallersr);
		AttachementSQLRequestConnectionManager asrcm = new AttachementSQLRequestConnectionManager(c, dbq, rcallersr);
		AttachementDatabaseSQLRequest adsr = new AttachementDatabaseSQLRequest(c, rcalledsr, qi);
		
		// SecurityQuery
		RoleCallerSecurityQuery rcallersq = new RoleCallerSecurityQuery(c);
		RoleCalledSecurityQuery rcalledsq = new RoleCalledSecurityQuery(c);
		SecurityQuery sq = new SecurityQuery(c, rcalledsq, rcallersq);
		AttachementSecurityQueryDatabase asqd = new AttachementSecurityQueryDatabase(c, sm, rcallersq);
		AttachementSecurityManagerSecurityQuery asmsq = new AttachementSecurityManagerSecurityQuery(c, rcalledsq, cq);

		// ServerDetails
		ReceiveRequestRequis rrr = new ReceiveRequestRequis(c);
		ServeurDetails sd = new ServeurDetails(c,cm,sm,d,rrr,cr,sr,sq);
		
		// Server
		ReceiveRequestFournis rrf = new ReceiveRequestFournis(c);
		Serveur s = new Serveur(c, rrf);
		BindingServeur bs = new BindingServeur(c, rrf, rrr);
		
		// Client
		SendRequest srequest = new SendRequest(c);
		Client cl = new Client(c, srequest);
		
		// RPC
		RoleCalledRpc rcalledr = new RoleCalledRpc(c);
		RoleCallerRpc rcallerr = new RoleCallerRpc(c);
		Rpc rpc = new Rpc(c,rcalledr,rcallerr);
		AttachementServeurRpc asr = new AttachementServeurRpc(c, rcalledr, rrr);
		AttachementClientRpc acr = new AttachementClientRpc(c, srequest, rcallerr);
		
		// SimpleCS
		SimpleCs simplecs = new SimpleCs(c, cl, rpc,  s, bs, sd, acr, asr);
		
		
		
	}

}
