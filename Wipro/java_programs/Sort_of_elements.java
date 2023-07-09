import java.util.Scanner;

public class Sort_of_elements {

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
		int temp;
		//Arrays.sort(arr);
		for (int j =0;j<arr.length;j++)
		{
			for(int k =j+1;k<arr.length;k++)
		    {
			 temp =0;
			 if (arr[j]>arr[k])
			 { 
			  temp = arr[j];
			  arr[j] = arr[k];
			  arr[k] = temp;
			 }
		 }
		}
		for(int c:arr)
		{
			System.out.print(c+" ");
		}
		
	}

}
