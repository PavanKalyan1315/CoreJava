package java_8;

import java.util.Optional;

public class optional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String[]str= new String[10];
   str[0]="java";
   Optional<String> cn = Optional.ofNullable(str[1]);
   if(cn.isPresent()) {
	   System.out.println(str[1].length());
   }else
   {
	   System.out.println("String is null");
   }
   System.out.println("statement 1");
   System.out.println("statement 1");
   System.out.println("statement 1");
   System.out.println("statement 1");
   System.out.println("statement 1"); 
	}

}
