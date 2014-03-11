package Kamarad;


/**
* Kamarad/KamaradAccountDetailsHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Kamarad.idl
* 11 March 2014 16:39:53 o'clock GMT
*/

abstract public class KamaradAccountDetailsHelper
{
  private static String  _id = "IDL:Kamarad/KamaradAccountDetails:1.0";

  public static void insert (org.omg.CORBA.Any a, Kamarad.KamaradAccountDetails that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static Kamarad.KamaradAccountDetails extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [5];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[0] = new org.omg.CORBA.StructMember (
            "name",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[1] = new org.omg.CORBA.StructMember (
            "phoneNumber",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().create_string_tc (0);
          _members0[2] = new org.omg.CORBA.StructMember (
            "address",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_double);
          _members0[3] = new org.omg.CORBA.StructMember (
            "credit",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_long);
          _members0[4] = new org.omg.CORBA.StructMember (
            "uniqueId",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (Kamarad.KamaradAccountDetailsHelper.id (), "KamaradAccountDetails", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static Kamarad.KamaradAccountDetails read (org.omg.CORBA.portable.InputStream istream)
  {
    Kamarad.KamaradAccountDetails value = new Kamarad.KamaradAccountDetails ();
    value.name = istream.read_string ();
    value.phoneNumber = istream.read_string ();
    value.address = istream.read_string ();
    value.credit = istream.read_double ();
    value.uniqueId = istream.read_long ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, Kamarad.KamaradAccountDetails value)
  {
    ostream.write_string (value.name);
    ostream.write_string (value.phoneNumber);
    ostream.write_string (value.address);
    ostream.write_double (value.credit);
    ostream.write_long (value.uniqueId);
  }

}
