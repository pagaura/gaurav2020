package assigment24junforloop;

public class checkprimenum {


			public static void main(String[] args) {
			int i = 60;
			for(i=1;i<=60;i++) {
		    int divisioncount = 0;
		    for(int num=i;num>=1;num--) {
		    	if(i%num==0) {
		    divisioncount = divisioncount + 1;
		    	}
		    	}
		    if(divisioncount==2) {
		    	System.out.println(i + " is prime number");
		    }
		    else {
		    	System.out.println(i + " is not prime number");
		    	
		    }
		    	
		    }
		    	
			}

		
	}


