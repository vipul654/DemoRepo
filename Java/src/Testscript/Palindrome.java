package Testscript;

public class Palindrome {

	public static void main(String[] args) 
	{
		
		 int num = 121, r, s=0;
		while (num>0) 
		{
	
		 r= num%10;
		 num= num/10;
		 s= s*10+r;
		 
		if (num==s) 

		{
			System.out.println( "Palindrome");
		}
		else {
			System.out.println("not Palindromne");
		}
			
		
	}

	}}
