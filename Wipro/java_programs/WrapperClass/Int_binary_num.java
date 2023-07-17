package WrapperClass;

import java.util.Scanner;

public class Int_binary_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the integer :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String binaryString = Integer.toBinaryString(num);
	    String paddedBinaryString = String.format("%8s", binaryString).replace(' ', '0');
	    System.out.println(paddedBinaryString);

	}

}
