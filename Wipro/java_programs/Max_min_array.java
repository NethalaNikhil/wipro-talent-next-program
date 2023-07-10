
public class Max_min_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50,60,70,80,90,100};
		int Max = arr[0],Min=arr[0];
		for(int i =1 ; i<=arr.length-1;i++)
		{
			
			if (Max<arr[i])
			{
				Max=arr[i];
				
			}
			if (Min>arr[i])
			{
				Min=arr[i];
				
			}
		}
		System.out.println(Max+" "+Min);
		

	}

}
