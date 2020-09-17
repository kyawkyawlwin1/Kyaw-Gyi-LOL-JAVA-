package Chapter6;
import java.util.*;

import javax.print.DocFlavor.STRING;
public class Calculator2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		String op;
		System.out.println("Enter Number 1");
		num1 = sc.nextInt();
		System.out.println("Enter Number 2");
		num2 = sc.nextInt();
		System.out.println("Enter Operator");
		op = sc.next();
		int a = calculate(op,num1,num2);
		System.out.print("Ans = "+a);

	}
	
	private static int calculate(String o, int n1, int n2) 
	{
		int ans=0;
		if (o.equals("+"))
			ans=n1+n2;
		else if (o.equals("-"))
			ans=n1-n2;
		else if (o.equals("*"))
			ans=n1*n2;
		else if (o.equals("/"))
			ans=n1/n2;
		return ans;
		
	}

}
