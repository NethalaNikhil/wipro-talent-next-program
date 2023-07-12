package Strings;
import java.util.*;
public class SubStringEx {

	public static void main(String[] args) {
		String str1;
		int length;
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		str1 = sc.nextLine();
		length = str1.length();
		if(length%2==0)
		{
			System.out.println(str1.substring(0,length/2));
		}
		else
		{
			System.out.println("null");
		}

	}

}
