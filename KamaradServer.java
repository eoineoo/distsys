// KamaradServer.java

import Kamarad.*;
import java.util.* ;
import java.io.* ;
import org.omg.CORBA.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;

public class KamaradServer {

    public static void main(String args[]) {
		try	{
	    	ORB orb = ORB.init(args, null);

			NameComponent nc[] = new NameComponent[1];
			
			KamaradProvider kP = new KamaradProvider_Tie(new KamaradServant(orb)) ;
			orb.connect(kP);
			System.out.println("Orb connected.");
			org.omg.CORBA.Object obj = orb.resolve_initial_references("NameService");
			System.out.println("Found NameService.");
			
			//Root context
			NamingContext rootCtx = NamingContextHelper.narrow(obj);
			System.out.println("Context [ Root ] created");
			
			//Context Kamarad
			nc[0] = new NameComponent("Kamarad", "Context");
			NamingContext kamaradCtx = rootCtx.bind_new_context(nc);
			System.out.println("Context [ Kamarad ] added to [ Root ]");
			
			//Object KamaradProvider
			nc[0] = new NameComponent("KamaradProvider", "Object");
			kamaradCtx.rebind(nc, kP);
			System.out.println("Object ( KamaradProvider ) added to Context [ Kamarad ]");
			
			// wait for invocations from clients
			orb.run();

		} 
		catch (Exception e) {
	    	System.err.println("ERROR: " + e);
	    	e.printStackTrace(System.out);
		}
	}
}

