package arryassin;

public class smallestelement {

		public static void main(String[] args) {
			int[]arr = new int[] {1000,500,3000,6000};

			int min =arr[0];
			
			for(int i =0;i<arr.length;i++){
				
				if(arr[i]< min) 
					min = arr[i];
			}
				System.out.println("largest element present in given array:" + min);
		}

	}


