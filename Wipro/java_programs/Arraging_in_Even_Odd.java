package java_programs;

import java.util.*;

public class Arraging_in_Even_Odd {
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
int new_arr[] = new int [n];	
int e_pos =0;
//Arraging in even and odd
      for(int j =0 ;j<n;j++)
      {
    	  if(arr[j]%2==0)
    	  {
    		  new_arr[e_pos]=arr[j];
    		  e_pos++;
    		 
    	  }
      }
      for(int k =0 ; k<n ;k++)
      {
    	  if(arr[k]%2!=0)
    	  {
    		  new_arr[e_pos]=arr[k];
    		  e_pos++;
    	  }
      }
      System.out.println();
      System.out.print("[");
		for(int e:new_arr)
		{
			System.out.print(e+"");
		}
		System.out.print("]");
}
}