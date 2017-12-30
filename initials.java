public class initials{
	public static void main(String[] args) {
		int i,j;
		for (i=1; i<=7; i++) {
			System.out.println();
			for (j=1; j<=12; j++) {
				if(i==1){
					if(j!=5 && j<6)
						System.out.print('B');					
					else if(j==8 || j==12)
						System.out.print('K');
					else
						System.out.print(' ');
				}
				if(i==2){
					if(j==1 || j==5)
						System.out.print('B');

					else if(j==8 || j==11)
						System.out.print('K');
					else
						System.out.print(' ');
				}
				if(i==3){
					if(j==1 || j==5)
						System.out.print('B');
					else if(j==8 || j==10)
						System.out.print('K');
					else
						System.out.print(' ');
				}
				if(i==4){
					if(j!=5 && j<6)
						System.out.print('B');
					else if(j==8 || j==9)
						System.out.print('K');
					else
						System.out.print(' ');
				}
				if(i==5){
					if(j==1 || j==5)
						System.out.print('B');
					else if(j==8 || j==10)
						System.out.print('K');
					else
						System.out.print(' ');
				}
				if(i==6){
					if(j==1 || j==5)
						System.out.print('B');
					else if(j==8 || j==11)
						System.out.print('K');
					else
						System.out.print(' ');
				}
				if(i==7){
					if(j!=5 && j<6)
						System.out.print('B');
					else if(j==8 || j==12)
						System.out.print('K');
					else
						System.out.print(' ');
				}

				if(j>5&&j<8){
					System.out.print(' ');
				}
			}
			
		}
	}
}