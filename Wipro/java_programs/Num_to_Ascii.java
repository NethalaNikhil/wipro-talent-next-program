import java.util.Scanner;

public class Num_to_Ascii {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of elements:");
		int n = sc.nextInt();
		int arr[] = new int [n];
		System.out.println("Enter "+n+" elements into the array");
		for(int i =0 ; i<=arr.length-1;i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.print("{");
		for(int j=0; j<=arr.length-1;j++)
		{
			System.out.print((char)arr[j]+" ");
		}
		System.out.print("}");
	}

}
