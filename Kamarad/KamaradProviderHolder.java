package Kamarad;

/**
* Kamarad/KamaradProviderHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Kamarad.idl
* 11 March 2014 17:41:53 o'clock GMT
*/

public final class KamaradProviderHolder implements org.omg.CORBA.portable.Streamable
{
  public Kamarad.KamaradProvider value = null;

  public KamaradProviderHolder ()
  {
  }

  public KamaradProviderHolder (Kamarad.KamaradProvider initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Kamarad.KamaradProviderHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Kamarad.KamaradProviderHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Kamarad.KamaradProviderHelper.type ();
  }

}
