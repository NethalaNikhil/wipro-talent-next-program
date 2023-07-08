import java.util.Scanner;

public class Reverse_a_string {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String num = Integer.toString(number);
		String sum="";
		int c_num = number;
		for(int i=1;i<=num.length();i++)
		{
			sum = sum+number%10;
			number=number/10;
		}
		System.out.println("Sum of "+c_num+" is "+sum);

	}

}
