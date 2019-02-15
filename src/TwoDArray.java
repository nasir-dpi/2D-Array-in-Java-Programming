import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row, col,i,j;
		int[][] ar1 = new int[4][4] ;
	    	Scanner s1 = new Scanner(System.in) ;
	    	row= s1.nextInt();
	    	col= s1.nextInt();
	    	for( i =0;i<row;i++) {
	    		for( j=0;j<col;j++) {
	    			ar1[i][j]= s1.nextInt();
	    		}
	    	} 
	
				for( i =0; i<row;i++) {
					for( j=0;j<col;j++) {
						System.out.print(ar1[i][j]+" ");
				  	}
					System.out.println();
				}
				
				
				
				int[][] ar2 = new int[4][4] ;
		    	Scanner s2 = new Scanner(System.in) ;
		    	row= s2.nextInt();
		    	col= s2.nextInt();
		    	System.out.println();
		    	for( i =0;i<row;i++) {
		    		for( j=0;j<col;j++) {
		    			ar2[i][j]= s2.nextInt();
		    		}
		    	}
		    	System.out.println();
		
					for( i =0; i<row;i++) {
						for( j=0;j<col;j++) {
							System.out.print(ar2[i][j]+" ");
						}
						System.out.println();
					}
				int [][] ar3 = new int[4][4];
				for(i=0;i<row;i++) {
					for(j=0;j<col;j++) {
						ar3[i][j]=ar1[i][j]+ar2[i][j];
					
					}
				}
				
				System.out.println();
				for(i=0;i<row;i++) {
					for(j=0;j<col;j++) {
						System.out.print(ar3[i][j]+" ");
					}
					System.out.println();
				}
	}

}
