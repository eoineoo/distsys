package Kamarad;

/**
* Kamarad/KamaradAccountDetailsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Kamarad.idl
* 11 March 2014 16:39:53 o'clock GMT
*/

public final class KamaradAccountDetailsHolder implements org.omg.CORBA.portable.Streamable
{
  public Kamarad.KamaradAccountDetails value = null;

  public KamaradAccountDetailsHolder ()
  {
  }

  public KamaradAccountDetailsHolder (Kamarad.KamaradAccountDetails initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Kamarad.KamaradAccountDetailsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Kamarad.KamaradAccountDetailsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Kamarad.KamaradAccountDetailsHelper.type ();
  }

}