
public class Matrix {

	public static void main(String[] args) {
		
	    int a[][]= {{1,4,5},{3,6,1},{7,9,2}};
	    int b[][]= {{5,2,6},{5,2,1},{1,4,1}};
	    int sum[][]=new int[3][3];
	    for(int i=0;i<3;i++) {
	    	
	    	for(int j=0;j<3;j++) {
	    		
	    		sum[i][j]= a[i][j] +b[i][j];
	    	    System.out.println(sum[i][j]+ " ");
	    	}
	    	System.out.println();
	    }
	}
}
