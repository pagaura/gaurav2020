package arryassin;

public class removedub21 {
     
	public static void main(String[] args) {
	int arr[]= {1,2,2,3,4,4,5,6,6,7};
	int length =arr.length;
	int temp[]= new int [arr.length];
	int j=0;
	
	for(int i=0;i<length-1;i++) {
		
		if(arr[i]!=arr[i+1]) {
			temp[j++]=arr[i];
		}
	}
	temp[j++]=arr[length-1];
	for(int k=0;k<j;k++) {
		System.out.print( temp[k]);
	}
}
}