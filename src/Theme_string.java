
	

public class Theme_string {

	public static void main(String[] args) {
		String q ="yashoda hosptial";
		System.out.println(q.toUpperCase());
		String w ="dr.prasadkumar";
		System.out.println(w.toLowerCase());
		// concat
String s = "patient";
String a=s.concat("..ramesh");
System.out.println(s);
System.out.println(a);
System.out.println("...........");

System.out.println(" ramesh has high fever");
System.out.println(s.equals ("patient"));
System.out.println("...........");
//charAt
String e= "O A AB B";
System.out.println("bloodgroup");
System.out.println(e.charAt(2));
System.out.println("...........");
//contains
String d ="patient";
System.out.println("patient has maleriya");
System.out.println(d.contains("patient"));
// index substring
String f = "hornplease slient ";
System.out.println(f.substring(4));
//trim
String l = "         go to wardnumber 6";

System.out.println(l.trim());
System.out.println("...........");
// StringBuffer
System.out.println("doctor name");
StringBuffer b = new  StringBuffer("dr.prasad" );
StringBuffer b1 = new  StringBuffer( ".MBBS");
System.out.println(b);
System.out.println(b1);
//split
System.out.println("...........");
String n = "medicine ,tablets ,tanic ,injections ,selynebottles";
String []x=n.split(",");
for (String c:x) {
System.out.println(c);	
}
	}

}


