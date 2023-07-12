package Strings;

import java.util.Scanner;

public class Short_long_Strings {

	public static void main(String[] args) {
		 String str1,str2;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the str1:");
		 str1 = sc.nextLine();
		 System.out.println("Enter the str2:");
		 str2 = sc.nextLine();
		 if(str1.length()>str2.length())
		 {
			 System.out.println(str2+str1+str2);
		 }
		 else
		 {
			 System.out.println(str1+str2+str1);
		 }

	}

}
