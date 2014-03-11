//KamaradServant.java
import Kamarad.*;
import java.util.* ;
import java.io.* ;
import org.omg.CORBA.*;
import java.util.Hashtable;

public class KamaradServant	implements KamaradProviderOperations	{

	private ORB orb;
	private Hashtable<Integer, KamaradAccountDetails> hashTable = new Hashtable<Integer, KamaradAccountDetails>();	
	private int uniqueIdNew;
	
	//Constructor
	public KamaradServant(ORB orb)	{
		this.orb = orb;
	}
	
	//Register
	public void register (Kamarad.KamaradAccountDetails accountDetails, org.omg.CORBA.AnyHolder anyUniqueIdHolder)	{
		
		//This code was already here
		Any anyUniqueId = orb.create_any();
		
		//Create a new unique ID from 1000000 - 9999999
		//uniqueIdNew = (int) (Math.random() * ((9999999 - 1000000) + 1) + 1000000);
		uniqueIdNew = 123456789;
		
		//Create a KamaradAccountDetails object, fill in the details and insert to the HashTable
		accountDetails.name = "Eoin McCrann";
        accountDetails.address = "123 Fake Street";
        accountDetails.phoneNumber = "0871234567";
        accountDetails.credit = 1000.75;
        accountDetails.uniqueId = uniqueIdNew;

		//Create a hash table and store this value in it
		hashTable.put(uniqueIdNew, accountDetails);
		
		//This code was already here
		anyUniqueId.insert_longlong(uniqueIdNew);
		anyUniqueIdHolder.value = anyUniqueId;
	}
	
	//Return balance - retrieve the entire record
	public void getDetails (int uniqueId, Kamarad.KamaradAccountDetailsHolder accountDetailsHolder)	{
		
		// Look up and retrieve the account details for this user
        KamaradAccountDetails accountDetails = new KamaradAccountDetails();
        hashTable.get(uniqueId);
		
		//Required?
		String name = accountDetails.name;
	    String address = accountDetails.address;
        String phoneNumber = accountDetails.phoneNumber;
        double credit = accountDetails.credit;
			
        // Put the account into a holder object for returning
        accountDetailsHolder.value = accountDetails;
	}
	
	//Topup
	public void topupAccount (int uniqueId, double amount)	{
		// TODO
        // Look up the account details for this user and update the credit by adding the specified top-up to the existing balance
		KamaradAccountDetails accountDetails = new KamaradAccountDetails();
        hashTable.get(uniqueId);
		
		double oldCredit = accountDetails.credit;
		double newCredit = oldCredit + amount;
		
		accountDetails.credit = newCredit;
		
	}
	
}