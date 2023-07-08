
public class Prime_or_not_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count=0,i,j;
		 for(i = 10 ; i <=99; i++)
		 {   
		   count =0;
		   for(j = 1;j <= i/2; j++)
		   {
			 if(i%j==0)
			 {
			  count = count+1; 
			 }
		   }
			 if(count<2)
			 {
				 System.out.println(i+" is a  prime");
			 }
		   }
		   
		 }
	}
