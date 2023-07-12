package Strings;

import java.util.Scanner;

public class N_Repeatation {

	public static void main(String[] args) {
		String str1,str2;
		int n ;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the str1:");
		 str1 = sc.nextLine();
		 System.out.println("Enter the n repitation of substring:");
		 n = sc.nextInt();
		 str2 = str1.substring(n-1, str1.length());
		 for(int i =0 ; i<=str2.length()-1;i++)
		 {
			 System.out.print(str2);
		 }

	}

}
