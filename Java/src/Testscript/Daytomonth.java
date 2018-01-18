package Testscript;

import java.util.Scanner;

public class Daytomonth {

	public static void main(String[] args) 
	{
		
		int v, years,week ,day;
		
		
		
		Scanner input = new Scanner(System.in);
		  System.out.println(" type number");
		   v=input.nextInt();
		      
		   years= v/365;
		   v=v%365;
		   System.out.println("number of years  :"    + years);
		   
		     week= v /7;
		     v= v/7;
		     System.out.println("No. of weeks:"+week);
		      day = v;
		   System.out.println(" number of days:"+day);
		   
		   
		   
		   
		    /* int num = Integer.parseInt(args[0]);
			int days = num%30;
			int month = num/30;
			System.out.println(num+" days = "+month+" Month and "+days+" days") 
		  */
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
