package Strings;

import java.util.Scanner;

public class Combining_Elements {

	public static void main(String[] args) {
		 String str1,str2;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the str1:");
		 str1 = sc.nextLine();
		 System.out.println("Enter the str2:");
		 str2 = sc.nextLine();
		 StringBuffer sb = new StringBuffer();
		 if(str1.length()>=str2.length())
		 {
		  for(int i=0;i<=str2.length()-1;i++)
		  {
			 sb.append(str1.charAt(i));
			 sb.append(str2.charAt(i));
		  }
		  sb.substring(str2.length()+1);
          System.out.println(sb);
	     }
		 else
		 {
			 for(int i=0;i<=str1.length()-1;i++)
			  {
				 sb.append(str1.charAt(i));
				 sb.append(str2.charAt(i));
			  }
			  sb.substring(str1.length()+1);
	          System.out.println(sb);
		 }

}
}
