package palidrome;

public class pali1 {


			public static void main(String[] args) {         
				
				//1221  ->   1221
				//nitin  ->  nitin
				//rupali ->  ilapur
				int remainder, revNum = 0;
				
				int n =4224; //1221; 
				int temp = n;  //or int temp = 1221;//or int temp = 4224
				
				while(n!=0) {
					remainder = n%10;   //1  ,  //2  , //2   //1  && 4 , 2 , 2 , 4
					revNum = (revNum*10) + remainder;  //1  ,//10+2=12,  //120+2=122,  //1220+1= 1221
					                                   //4  ,//40+2=42   //420+2=422,  //4220+4=4224
					
					n = n/10; //122,  //12,  //1,  //0
				             	
				}
				
				if(revNum==temp) {
					System.out.println(revNum + " is Palindrome");
				}
				else {
					System.out.println(revNum + " is not a Palindrome");
				}
				
				

			}

		}

	