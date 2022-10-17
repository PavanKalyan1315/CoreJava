
public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "hello";
String a = s.concat("world"); 
// concat method;
System.out.println(s);
System.out.println(a);
System.out.println(s.equals("hello"));
System.out.println(s.equalsIgnoreCase("hello"));

	//charAt
String  d ="hello";
System.out.println(d.charAt(1));
//contains
String f = " pavan kalyan is bad boy";
System.out.println(f.contains("kalyan"));
System.out.println(f.contains("java"));
//index
String  g ="pavan kalyan is bad boy";
System.out.println(g.substring(3));
// toLowerCase
String h = " pavan kalyan is bad boy";
System.out.println(h. toLowerCase());
// to UpperCase
System.out.println(h.toUpperCase());
//trim
String j = "                pavan kalyan is bad boy";
System.out.println(j.trim());
//spit
String k = " pavan kalyan $";
String []x =k.split("");
for (String e:x ) {
System.out.println(e);

}




	

		//stringBuffer
		StringBuffer p = new StringBuffer ("sai");
		StringBuffer p1 = new StringBuffer ("kiran");

		System.out.println(p);
		System.out.println(p1);
	
		}
}

