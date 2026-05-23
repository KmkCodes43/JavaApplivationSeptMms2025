import java.util.scanner;

public class IfElseStatement{
    public static void main(String[] args) {
	scanner input = new scanner(System.in);
	int score;
	String name;
	String subject;
	
	System.out.print("Enter your name: ");
	subject = input,nextLine();
	
	System.out.print(Enter your subject: ");
	subject = input,nextLine();
	
	System.out.print("Enter your score: ");
	subject = input,nextLine();
	
	if(score>=70){
	 System.out.printf("Full Name: %s%n", name);
	 System.out.printf("Subject: %s%n", subject);
	 System.out.printf("Score: %d%n", score);
     System.out.println("Grade:A")	
	}
	else if(score>=60){
	 System.out.printf("Full Name: %s%n", name);
	 System.out.printf("Subject: %s%n", subject);
	 System.out.printf("Score: %d%n", score);
     System.out.println("Grade:B")	
	}
	else if(score>=50){
	 System.out.printf("Full Name: %s%n", name);
	 System.out.printf("Subject: %s%n", subject);
	 System.out.printf("Score: %d%n", score);
     System.out.println("Grade:C")	
	}
	else if(score>=40){
	 System.out.printf("Full Name: %s%n", name);
	 System.out.printf("Subject: %s%n", subject);
	 System.out.printf("Score: %d%n", score);
     System.out.println("Grade:D")	
	}
	else if(score>=){30
	 System.out.printf("Full Name: %s%n", name);
	 System.out.printf("Subject: %s%n", subject);
	 System.out.printf("Score: %d%n", score);
     System.out.println("Grade:E")	
	}
	else{
	 System.out.printf("Full Name: %s%n", name);
	 System.out.printf("Subject: %s%n", subject);
	 System.out.printf("Score: %d%n", score);
     System.out.println("Grade:F")	
	}
	}
}