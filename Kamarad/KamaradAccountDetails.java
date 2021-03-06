package Kamarad;


/**
* Kamarad/KamaradAccountDetails.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Kamarad.idl
* 11 March 2014 17:41:53 o'clock GMT
*/

public final class KamaradAccountDetails implements org.omg.CORBA.portable.IDLEntity
{
  public String name = null;
  public String phoneNumber = null;
  public String address = null;
  public double credit = (double)0;
  public int uniqueId = (int)0;

  public KamaradAccountDetails ()
  {
  } // ctor

  public KamaradAccountDetails (String _name, String _phoneNumber, String _address, double _credit, int _uniqueId)
  {
    name = _name;
    phoneNumber = _phoneNumber;
    address = _address;
    credit = _credit;
    uniqueId = _uniqueId;
  } // ctor

} // class KamaradAccountDetails
