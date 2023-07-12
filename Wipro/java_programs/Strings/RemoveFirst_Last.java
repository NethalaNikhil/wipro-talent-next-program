package Strings;
import java.util.*;
public class RemoveFirst_Last {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("");
		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		sb.append(sc.nextLine());
		int len = sb.length();
		sb.deleteCharAt(len-1);
		sb.delete(0, 1);
		System.out.println(sb);

	}

}
