package Chapter6;
import java.util.*;
public class Calculator1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;String op;
		System.out.println("Enter Number 1 :");
		num1 = sc.nextInt();
		System.out.println("Enter Number 2 :");
		num2 = sc.nextInt();
		System.out.println("Enter Operator");
		op = sc.next();
		
		if(op.equals("+")) 
			add(num1,num2);
		else if(op.equals("-"))
			sub(num1,num2);
		else if(op.equals("*"))
			mul(num1,num2);
		else if(op.equals("/"))
			div(num1,num2);

	}
	
		public static void add(int n1,int n2)
		{
		int ans=0;
		ans=n1+n2;
		System.out.println("Ans ="+ans);
		}
		
		public static void sub(int n1,int n2)
		{
		int ans=0;
		ans=n1-n2;
		System.out.println("Ans ="+ans);
		}
		
		public static void mul(int n1,int n2)
		{
		int ans=0;
		ans=n1*n2;
		System.out.println("Ans ="+ans);
		}
		
		public static void div(int n1,int n2)
		{
		int ans=0;
		ans=n1/n2;
		System.out.println("Ans ="+ans);
		}

}
