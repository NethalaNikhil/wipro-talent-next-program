package WrapperClass;
import java.util.*;
public class Hext_Octal_decimal {

	public static void main(String[] args) {
		System.out.println("Enter the integer :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Integer n = new Integer(num);
		System.out.println("Given number :"+num+"\nBinary equivalent :"+n.toBinaryString(num)+"\nOctal equivalent :"+n.toOctalString(num)+"\nHexadecimal equivalent :"+n.toHexString(num));

	}

}
