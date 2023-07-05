public class FlowControl {
	public static void main(String args[])
	{
		int num = Integer.parseInt(args[0]);
		if (num>0)
		{
			System.out.println(num +"is a positive number");
		}
		else if (num<0)
		{
			System.out.println(num +"is a negative number");
		}
		else
			System.out.println(num +"is a zero");
	}

}