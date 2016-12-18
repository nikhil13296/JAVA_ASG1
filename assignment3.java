import java.util.Scanner;

public class assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,sum;
Scanner Input = new Scanner(System.in);
System.out.println("Enter Value of a" );
a= Input.nextInt();
System.out.println("Enter Value of b");
b= Input.nextInt();
sum=a+b;
b=sum-b;
a=sum-a;
System.out.println("a="+a);
System.out.println("b="+b);
Input.close();
	}

}
