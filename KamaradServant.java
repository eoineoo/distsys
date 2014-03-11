//KamaradServant.java
import Kamarad.*;
import java.util.* ;
import java.io.* ;
import org.omg.CORBA.*;
import java.util.Hashtable;

public class KamaradServant	implements KamaradProviderOperations	{

	private ORB orb;
	private Hashtable<Long, KamaradAccountDetails> hashTable = new Hashtable<Long, KamaradAccountDetails>();	
	private long uniqueId;
	
	//Constructor
	public KamaradServant(ORB orb)	{
		this.orb = orb;
	}
	
	//Register
	public void register (Kamarad.KamaradAccountDetails accountDetails, org.omg.CORBA.AnyHolder anyUniqueIdHolder)	{
		
		//This code was already here
		Any anyUniqueId = orb.create_any();
		
		//Create a new unique ID from 1000000 - 9999999
		uniqueId = (int) (Math.random() * ((9999999 - 1000000) + 1) + 1000000);
		
		//Create a hash table and store this value in it
		hashTable.put(uniqueId, null);
		
		//This code was already here
		anyUniqueId.insert_longlong(uniqueId);
		anyUniqueIdHolder.value = anyUniqueId;
	}
	
	//Return balance - retrieve the entire record
	public void getDetails (int uniqueId, Kamarad.KamaradAccountDetailsHolder accountDetailsHolder)	{
		// TODO
        // Look up and retrieve the account details for this user
        KamaradAccountDetails accountDetails = new KamaradAccountDetails();
        accountDetails.name = " <retrieved customer name> ";
        accountDetails.address = " <retrieved customer address> ";
        accountDetails.phoneNumber = " <retrieved mobile number> ";
        accountDetails.credit = 0.0; // Retrieved credit balance
        accountDetails.uniqueId = 1; // Retrieved unique identifier

        // Put the account into a holder object for returning
        accountDetailsHolder.value = accountDetails;
	}
	
	//Topup
	public void topupAccount (int uniqueId, double amount)	{
		// TODO
        // Look up the account details for this user and update the credit by adding the
        // specified top-up to the existing balancefac
	}
	
}