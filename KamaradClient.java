// KamaradClient.java

import Kamarad.*;
import org.omg.CORBA.*;
import java.io.* ;
import java.util.* ;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;

public class KamaradClient {
    	public static void main(String args[]) {
		try{
			ORB orb = ORB.init(args, null);

			//Obtaining the object reference to the Name Service
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			
			//Narrowing the object reference of the Name Service to the correct Type
			NamingContext rootCtx = NamingContextHelper.narrow(objRef);
			
			//Creating a name of the desired object that we want to get the object reference of, from the name server
			NameComponent[] path = new NameComponent[2];
			path[0] = new NameComponent("Kamarad", "Context");
			path[1] = new NameComponent("KamaradProvider", "Object");
			
			org.omg.CORBA.Object objKamarad = rootCtx.resolve(path);

			//Converting the retireved object reference from the Name Service to the correct type
			KamaradProvider kamaradRef = KamaradProviderHelper.narrow (objKamarad);

			KamaradAccountDetails accountDetails = new KamaradAccountDetails();
			
			//Creating an AnyHolder that will hold the uniqueId parameter from the register operation call
			AnyHolder anyUniqueIdHolder = new AnyHolder();

			//Creating an any that will hold the return information from the register operation call
			//kamaradRef.register(accountDetails, anyUniqueIdHolder);
			
			//Convert Any type to UniqueId
			//Long uniqueId = anyUniqueIdHolder.value.extract_longlong();
			
			//System.out.println("UniqueId: " + uniqueId) ;
			System.out.println("UniqueId: ") ;

		} catch (Exception e) {
	    		System.out.println("ERROR : " + e) ;
	    		e.printStackTrace(System.out);
		}
    	}
}
