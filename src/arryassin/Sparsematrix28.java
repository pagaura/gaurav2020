package arryassin;

public class Sparsematrix28 {

	public static void main(String[] args) {
		int rows,cols,size,count=0;
		int a[][]= {
				{7,0,0},
				{0,8,0},
				{0,0,9}
		};
		rows=a.length;
		cols=a[0].length;
		size=rows*cols;
		
		for(int i=0;i<rows;i++) {
        for(int j=0;j<cols;j++) {
        	if(a[i][j]==0)
        		count++;
        }
		}
		if(count>(size/2))
			System.out.println("given matrix is sparse matrix");
		else
			System.out.println("given matrix is not sparse matrix");
	}
}