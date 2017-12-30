import java.util.*;
public class bmi{
	public static void main(String[] args) {
		int f,i,w;
		double bmi,wk,fi,h;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("What is your height(feet) :");
		f = keyboard.nextInt();
		System.out.print("What is your height(inches) :");
		i = keyboard.nextInt();
		System.out.print("What is your weight(pounds) :");
		w = keyboard.nextInt();

		wk = w/2.2;
		fi = f*12;
		h = (fi + i)*2.54/100;

		bmi = wk/(Math.pow(h,2));

		System.out.println("BMI : "+bmi);
	}
}