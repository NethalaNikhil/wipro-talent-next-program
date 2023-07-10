package java_programs;

import java.util.*;

public class Only_1_Or_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of elements:");
		int n = sc.nextInt();
		int arr[] = new int [n];
		System.out.println("Enter "+n+" elements into the array");
		for(int i =0 ; i<=n-1;i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.print("{");
		for(int d:arr)
		{
			System.out.print(d+" ");
		}
		System.out.print("}");
	 int flag =0;	
	 for(int j = 0 ; j<n;j++)
	 {
		if(arr[j]== 1 || arr[j]==4) 
		{
			flag = 1;
		}
		else
		{
			flag = 0;
			break;
		}
	 }
	 System.out.println();
	 if(flag == 1)
	 {
		 System.out.println("true");
	 }
	 else
	 {
		 System.out.println("false");
	 }

	}

}
