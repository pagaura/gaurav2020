package arryassin;

public class Productmatrices33 {

	public static void main(String[] args) {
		int rows1,cols1,rows2,cols2;
		int a[][]= {
				{1,2,2},
				{1,3,3},
				{1,4,4}
		};
		int b[][]= {
				{1,5,5},
				{1,6,6},
				{1,7,7}
		};
		rows1=a.length;
		cols1=a[0].length;
		 
		rows2=b.length;
		cols2=b[0].length;
		
		if(cols1!=rows2){
			System.out.println("matrices cannot be multiply");
			
		}
		else {
			int prod[][]=new int[rows1][cols2];
			
			for(int i=0;i<rows1;i++) {
			for(int j=0;j<cols2;j++) {
				for(int k=0;k<rows2;k++) {
					prod[i][j]=prod[i][j]+a[i][k]*b[k][j];
				}
			}
		}
			System.out.println("product of two matrices:");
			for(int i=0;i<rows1;i++) {
				for(int j=0;j<cols2;j++) {
					System.out.print(prod[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}
