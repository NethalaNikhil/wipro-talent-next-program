public class SameWidth {
    static String LastDigit(int a ,int b)
    {
    	int Last_a = a%10;
    	int Last_b = b%10;
    	if(Last_a == Last_b)
    	{
    		return "True";
    	}
    	else {
    		return "False";
    	}
    	
    }
	public static void main(String[] args) {
		System.out.println(LastDigit(7,10));
		

	}

}
