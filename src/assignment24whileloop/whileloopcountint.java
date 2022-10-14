package assignment24whileloop;


	public class whileloopcountint {

		public static void main(String[] args) {
			int count = 5,num = 13452;
			while(num!=0) {
				num = num/10;
				++count;
			}
			System.out.println("number of digits " + count);

		}

	}


	
