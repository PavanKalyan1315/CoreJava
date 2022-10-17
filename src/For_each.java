import java.util.Scanner;

public class For_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[];
a=new int [11];
Scanner s = new Scanner(System.in);
for(int i=0;i<=10;i++) {
	System.out.println("enter the number");
	a[i]=s.nextInt();
}
System.out.println("out put is ...");
for (int y:a) {
	System.out.println(y);
}
	}

}
