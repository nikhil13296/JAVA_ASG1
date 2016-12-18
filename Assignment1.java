import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int A,B,Sum;
Scanner InputTaker=new Scanner(System.in);

System.out.println("Enter value of A");
A= InputTaker.nextInt();
System.out.println("A="+A);
System.out.println("Enter Value of B");
B= InputTaker.nextInt();
System.out.println("B="+B);
Sum=A+B;
System.out.println("Value of Sum is"+Sum);
InputTaker.close();	
	}

}
