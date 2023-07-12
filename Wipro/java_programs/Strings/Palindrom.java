package Strings;
import java.util.*;

public class Palindrom {

	public static void main(String[] args) 
	{  
        System.out.println("Enter String to check palindrom");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
	    String rev = sb.toString();
		if(str.equals(rev))
		{
			System.out.println(str+" is a palindrom");
		}
		else
		{
			System.out.println(str+" is not a palindrom");
		}
		
		
	 
 
	}

}
