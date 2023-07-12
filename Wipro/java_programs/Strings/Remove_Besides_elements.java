package Strings;
import java.util.*;
public class Remove_Besides_elements {
public static void main(String[] args) {
	System.out.println("Enter string in multiplication format ex:ab*cd:");
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	StringBuffer sb = new StringBuffer(str);
	int pos = str.indexOf("*");
	sb.delete(pos-1, pos+2);
	System.out.println(sb);
	
}
}