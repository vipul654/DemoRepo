import java.util.Scanner;

public class db2 {

	public static void main(String[] args)
	{
	
		int leap;
		
		
		System.out.println("type year");
		Scanner input= new Scanner(System.in);
		
		leap=input.nextInt();
		
		Boolean isleap= false;
		
		if ( leap%4==0)
		{
			if ( leap%100==0)
			{
				if ( leap%400==0) 
					
					isleap=true;
				else 
					isleap= false;
					
				}
					else
						isleap= true;
		
			}
			else
				isleap=false;

        if(isleap==true)
            System.out.println( leap+ " is a Leap Year.");
        else
            System.out.println(leap + " is not a Leap Year.");
    }
}
		
	


