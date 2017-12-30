import java.util.*;

public class relativeWeight{
	public static double findWeight(int o,int w){
		double r=0;
		if(o==1)	
			r=0.78 * w;		
		if(o==2)
			r=0.39*w;
		if(o==3)
			r=2.65*w;
		if(o==4)
			r=1.17*w;
		if(o==5)
			r=1.05*w;
		if(o==6)
			r=1.23*w;
		return r;

	}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int w,o;
		double result = 3.5;

		System.out.println("Please enter weight on earth");
		w = keyboard.nextInt();

		System.out.println("I have information for the current planets:");
		System.out.println("\t1. Venus\t2. Mars\t 3. Jupiter");
		System.out.println("\t4. Saturn\t5. Uranus\t 6.Neptune");
		System.out.println("Which planet are you visiting");
		o =  keyboard.nextInt();

		result=findWeight(o,w);
		System.out.println("Your relative weight would be " + result + "pounds");

		//System.out.println("helo" + result);

	}
}