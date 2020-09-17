package Chapter2;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n1,n2,ans=0;
		String op;
		
		System.out.print("Enter number 1 :");
		n1=sc.nextInt();
		System.out.print("Enter Number 2 :");
		n2=sc.nextInt();
		System.out.print("Enter operator :");
		op=sc.next();
		if (op.equals("+"))
			ans=n1+n2;
			else if (op.equals("-"))
				ans=n1-n2;
				else if (op.equals("*"))
					ans=n1*n2;
					else if (op.equals("/"))
						ans=n1/n2;
					else if (op.equals("%"))
						ans=n1%n2;
		System.out.println ("Ans = "+ans);
		sc.close();

		
	}

}
