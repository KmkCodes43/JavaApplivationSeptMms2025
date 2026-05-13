import java.util.Scanner

public class UserInput{
	public static void main(String[]  agrs){
		Scanner input = new Scanner(System.in);
		 
		 System.out.print("Enter your name: ");
		 String name = input.nextLine();
		 
		 System.out.printf("Enter your gender: ");
		 String gender = input.next();
		 
		 System.out.print("Enter your age;");
		 byte age = input.nextByte();	 
		 
		 System.out.print("Enter the number of students un your class: ");
		 short age =  input.nextShort());
		 
		 System.out.print("Enter your grade: ")
		 char grade = input.next()/charAt(0);
		 
		 System.out.print("Do you love learning java(true/false): ")
		 boolean loveJava = input.nextBoolean();
		 
		 System.out.println("");
		 System.out.printf("Information about %s%n", name);
		 System.out.println("=========================================");
	      
        System.out.printf("Hello %s, you are welcome to NIIT", name);
		 System.out.printf("You are a %s and you are %d years old" , gender,age);
		 System.out.printf("There are %d students in your class"%n,NumberOfStudent);
		 System.out.printf("Your grade is %c%n,grade);
		 System.out.printf("Do you love Java? %b%n,loveJava);
}
 