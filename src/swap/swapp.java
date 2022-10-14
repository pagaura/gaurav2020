package swap;

public class swapp {



			public static void main(String[] args) {
				
				System.out.println("Swap Number using temporary variable");
				
				int num1 = 80;//50;
				
				int num2 =120; //100;
				
				int temp = num1 + num2;  //150 //    200
				
				num1 = temp - num1;  //150-50 = 100 //   200-80=120
				
				num2 = temp - num2;  //150-100 = 50      200-120=80
								
				 System.out.println("num1 is " + num1);  //100   //120
			
				 
				 System.out.println("num2 is " + num2);   //50    //80
				

			}

		}

	


