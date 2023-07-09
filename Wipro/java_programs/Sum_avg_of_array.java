
public class Sum_avg_of_array {
	public static void main(String args[])
	{
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		int sum=0,avg;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum= sum+arr[i];
		}
		System.out.println("The sum of the array is "+sum);
		avg = sum/arr.length;
		System.out.println("The avg of the array is "+avg);
	}

}
