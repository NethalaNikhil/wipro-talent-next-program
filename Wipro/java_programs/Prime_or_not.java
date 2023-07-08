import java.util.*;
public class Prime_or_not
{
	public static void main(String args[])
	{
	 System.out.println("Enter number to check prime or not");
	 Scanner sc = new Scanner(System.in);
	 int num = sc.nextInt();
	 int count=0,i;
	
	 for(i = 1 ; i<=num/2;i++)
	 {   
		 if(num%i==0)
		 {
			count = count+1; 
		 }
	 }
	 if(count>=2)
	 {
		 System.out.println(num+" is a Not a prime");
	 }
	 else
	 {
		 System.out.println(num+" is a Prime number");
	 }
	}
	

}
