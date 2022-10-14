package arryassin;

public class Largestelement {

	public static void main(String[] args) {
		int[]arr = new int[] {9000,500,8000,6000};

		int max =arr[0];
		
		for(int i =0;i<arr.length;i++){
			
			if(arr[i]> max) 
				max = arr[i];
		}
			System.out.println("largest element present in given array:" + max);
	}

}

