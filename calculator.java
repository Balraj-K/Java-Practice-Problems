import java.util.*;
import java.lang.*;

public class calculator{
	public static double add(double a, double b){
		return(a+b);
	}
	public static double sub(double a, double b){
		return(a-b);
	}
	public static double mul(double a, double b){
		return(a*b);
	}
	public static double div(double a, double b){
		return(a/b);
	}
	public static double exp(double a, double b){
		return(Math.pow(a,b));
	}
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		double a,b,res;
		String op;
		res=0;
		do{
			System.out.print(">");
			a = k.nextDouble();
			op = k.next();
			b = k.nextDouble();
			if(op.equals("+"))
				res=add(a,b);
			if(op.equals("-"))
				res=sub(a,b);
			if(op.equals("*"))
				res=mul(a,b);
			if(op.equals("/"))
				res=div(a,b);
			if(op.equals("^"))
				res=exp(a,b);
			System.out.println(res);
		}while(a!=0);
	}
}