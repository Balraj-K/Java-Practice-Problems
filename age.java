import java.util.*;

public class age{

	public static void printResult(int age){
		if(age<16)
			System.out.println("You can't drive");
		else if(age<18)
			System.out.println("You can drive but not vote");
		else if(age<25)
			System.out.println("You can vote but not rent a car");
		else 
			System.out.println("You can do whatever you want");
		return;
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int age;

		System.out.println("Please enter your age");
		age = keyboard.nextInt();

		printResult(age);

	}
}