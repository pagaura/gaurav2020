package aramstrong;

public class aramstrong1 {


			public static void main(String[] args) {
				
				int n = 153, remainder; //4*4*4=64,5*5*5=125,3*3*3=27
				
				int result = 0;
						
				int temp = n;		
				
				while(n!=0) {
					remainder = n%10;
					//result = (int) (result + Math.pow(remainder, 3));  
					//OR
					result += Math.pow(remainder, 3);   
					n = n/10;	
				}
				
				if(result==temp) {
					System.out.println(result + " is Armstrong");
				}
				else {
					System.out.println(result + " is not an Armstrong ");
				}

			}

		}
	

