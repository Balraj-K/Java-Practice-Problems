import java.util.Scanner;

public class collatz{
	public static int generate(int k){
		if(k%2==0)
			return k/2;
		else
			return (3*k+1);
	}

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int i,count,largest;

		count = 0;

		System.out.println("please enter no.:");
		i = keyboard.nextInt();
		largest = i;
		do{
			System.out.println(i);
			i = generate(i);
			count++;
			if(largest<i){
				largest = i;
			}
		}while(i!=1);
		if(i == 1)
			System.out.println(i);
		System.out.println("Largest is: "+largest);
		System.out.println("Terminated after "+count+" steps");
	}
}