import java.util.Scanner;
public class basicio{
	public static void main(String[] args) {
		int a;
		String b;
		double c;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter integer:");
		a=keyboard.nextInt();

		System.out.print("Enter String:");
		b=keyboard.next();

		System.out.print("Enter double:");
		c=keyboard.nextDouble();

		System.out.println("Integer: "+a+", String: \""+b+"\", Double: "+c);
	}
}