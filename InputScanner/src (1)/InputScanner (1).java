import java.util.Scanner;
public class InputScanner {
public static void main(String[] args) {

    	int age;
    	String name;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a name: ");
    	name = sc.next();
    	System.out.println("Enter an age: ");
    	age = sc.nextInt();
    	System.out.println("Hi "+name+", you are "+age+" years old.");
    }
}
