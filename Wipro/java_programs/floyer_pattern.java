import java.util.*;
public class floyer_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter integer number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i ,j;
		for (i=1;i<=num;i++)
		{
			//System.out.println("i"+i);
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
