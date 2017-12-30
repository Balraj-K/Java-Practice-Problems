import java.util.GregorianCalendar;
public class today{

	public static String weekday(int d){
		String result;

		if(d==1){
			result="Sunday";
		}
		else if(d==2){
			result="Monday";
		}
		else if(d==3){
			result="Tuesday";
		}
		else if(d==4){
			result="Wednesday";
		}
		else if(d==5){
			result="Thursday";
		}
		else if(d==6){
			result="Friday";
		}
		else{
			result="Saturday";
		}
		return result;
	}

	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();
		int dow = cal.get(GregorianCalendar.DAY_OF_WEEK);

		System.out.println("Today is a " +weekday(dow));
	}
}