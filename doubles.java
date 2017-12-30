import java.util.*;


public class doubles{
	public static void main(String[] args) {
		int x,y;
		x=0;
		y=1;
		Random r = new Random();
		while(x!=y){
			System.out.print("Roll dice:");
			x = 1+r.nextInt(5);
			System.out.println(x);
			System.out.print("Roll 2nd time:");
			y = 1+r.nextInt(5);
			System.out.println(y);

			System.out.println("The total is:"+(x+y));
		}

	}
}