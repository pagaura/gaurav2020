package arryassin;

public class thirdlargestnumarray {

	public static void main(String[] args) {
      
		int temp, size;
		
		int arr[]= {60,20,57,63,96,25};
		
		size=arr.length;
		
		for(int i=0;i<size;i++) {
			
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]);
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	
		System.out.println("third largest number is "+ arr[size-3]);

}
}
		
		