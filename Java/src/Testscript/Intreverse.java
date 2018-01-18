package Testscript;

public class Intreverse {

	public static int reverse(int num)
	{
	  StringBuffer str= new StringBuffer(num+ "");
	return Integer.parseInt(str.reverse().toString());
			
	
	}

	
	public static void main(String[] args)
	{
		int num=325;
		System.out.println(reverse(num) );
		
	}
		
	
	
	
	
	
	
	
	
	
}
