import java.util.*;
public class io2{
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
        String fname,lname,login;
        int id,grade;
        double gpa;

        System.out.print("First name: ");
        fname = keyboard.next();
        System.out.print("Last name: ");
        lname = keyboard.next();
        System.out.print("grade (9-12): ");
        grade = keyboard.nextInt();
        System.out.print("Student ID: ");
        id = keyboard.nextInt();
        System.out.print("Login: ");
        login = keyboard.next();
        System.out.print("GPA (0.0-4.0): ");
        gpa = keyboard.nextDouble();

        System.out.println("Your Info :");

        System.out.println("\t Login:  "+login);
        System.out.println("\t ID:     "+id);
        System.out.println("\t Name:   "+lname+", "+fname);
        System.out.println("\t GPA:    "+gpa);
        System.out.println("\t Grade:  "+grade);
	}
} 