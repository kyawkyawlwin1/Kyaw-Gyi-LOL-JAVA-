package Chapter6;
import java.util.*;
public class Calculate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;String op;
		System.out.println("Enter Number 1 :");
		num1 = sc.nextInt();
		System.out.println("Enter Number 2 :");
		num2 = sc.nextInt();
		System.out.println("Enter Operator");
		op = sc.next();
		int a=0;
		if(op.equals("+")) 
			a=add(num1,num2);
		else if(op.equals("-"))
			a=sub(num1,num2);
		else if(op.equals("*"))
			a=mul(num1,num2);
		else if(op.equals("/"))
			a=div(num1,num2);
		System.out.println("Ans = "+a);

	}
	
		public static int add(int n1,int n2)
		{
		int ans=0;
		ans=n1+n2;
		return ans;
		}
		
		public static int sub(int n1,int n2)
		{
		int ans=0;
		ans=n1-n2;
		return ans;
		}
		
		public static int mul(int n1,int n2)
		{
		int ans=0;
		ans=n1*n2;
		return ans;
		}
		
		public static int div(int n1,int n2)
		{
		int ans=0;
		ans=n1/n2;
		return ans;
		}


}
