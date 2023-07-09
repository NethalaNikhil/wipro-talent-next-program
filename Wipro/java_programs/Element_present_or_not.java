package java_programs;
import java.util.*;
public class Element_present_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of elements:");
		int n = sc.nextInt();
		int arr[] = new int [n];
		System.out.println("Enter "+n+" elements into the array");
		for(int i =0 ; i<=arr.length-1;i++)
		{
			arr[i]= sc.nextInt();
		}
		System.out.println("Enter element to search :");
		int ele = sc.nextInt();
		int count=0;
		for(int j=0; j<=arr.length-1;j++)
		{
			if (arr[j]== ele)
			{
				System.out.println("Search element "+ele+" is found at "+j);
				count+=1;
			}
			
		}
		if(count<1)
		{
			System.out.println("-1");
		}

	}

}
