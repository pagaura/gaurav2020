package arryassin;

public class oddposition {

public static void main(String[] args) {
		
		int[]arr= new int [] {44,70,33,90,55};
		System.out.println("Element of given array present on even position");
		
		for(int i=0;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
		}
	}
	}