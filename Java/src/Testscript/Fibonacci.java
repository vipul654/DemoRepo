package Testscript;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) 
	{
		int k = 0,a=1,b=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		System.out.println("1 1");
		while (k<=n) 
		{
			k=a+b;
			if (k>=n) 
				break;
				
		}
		System.out.println(k+  "    " );
		a=b;
		
		
		
		
		
		
		
		
	}

}
