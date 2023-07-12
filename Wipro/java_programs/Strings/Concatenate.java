package Strings;
import java.util.*;
public class Concatenate {

	public static void main(String[] args) {
	 String str1,str2;
	 String a,b,l_a,l_b;
	 char i_b,i_a;
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the str1:");
	 str1 = sc.nextLine();
	 System.out.println("Enter the str2:");
	 str2 = sc.nextLine();
	 l_a = str1.toLowerCase();
	 l_b = str2.toLowerCase();
	 i_a = l_a.charAt(str1.length()-1);
	 i_b = l_b.charAt(0);
	 if (i_a == i_b)
	 {
		StringBuffer rem = new StringBuffer(l_b);
		rem.delete(0,1);
		System.out.println(l_a+rem);
	 }
	 else
	 {
		 System.out.println(l_a+" "+l_b);
	 }
	  

	}

}
