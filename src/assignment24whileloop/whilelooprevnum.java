package assignment24whileloop;

public class whilelooprevnum {

	

			public static void main(String[] args) {
				int num  = 987654321,reverse=0;
				while(num!=0) {
					int reminder = num%10;
					reverse = reverse * 10 + reminder;
					num = num/10;
					
					
				}
				System.out.println("the reverse of the given number is:  " + reverse);
				
				

			}

		}
	