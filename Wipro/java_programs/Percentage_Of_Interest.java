class Percentage_Of_Interest
{
 public static void main (String args[])
 {
 int age = Integer.parseInt(args[1]);
 if(args[0].equals("Female") && age >=1 && age<=58)
 {
 System.out.println("Percentage of interest is 8.2%");
 }
 else if (args[0].equals("Female") && age>58 && age<=100)
 {
 System.out.println("Percentage of interest is 8.2%");
 }
 else if (args[0].equals("Male") && age>=1 && age<=58)
 {
 System.out.println("Percentage of interest is 8.4%");
 }
 else if (args[0].equals("Male") &&  age>58 && age<=100)
 {
 System.out.println("Percentage of interest is 10.5%");
 }

 }
 }
 
