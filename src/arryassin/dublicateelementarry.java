package arryassin;

public class dublicateelementarry {

		public static void main(String[] args) {
			String arr[] = {"ram","Rohit","vicky","ram","sunil"};
			
			boolean flag = false;
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						System.out.println("Duplicate Element is " + arr[i]);
						flag=true;
					}
					
				}
				
			}
			if(flag==false) {
				System.out.println("Duplicate Elements not found");
			}

		}
}