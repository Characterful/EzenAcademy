package ezen;

public class MatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array1 = new int[5][4];
		int[][] array2 = new int[5][4];
		int[][] array3 = new int[5][4];
		for(int i=0;i<array1.length;i++)
			for(int j=0;j<array1[i].length;j++) {
				array1[i][j] = (int)(Math.random()*100)+1;
				array2[i][j] = (int)(Math.random()*100)+1;
				array3[i][j] = array1[i][j] + array2[i][j];
			}
		for(int i=0;i<array3.length;i++) {
			for(int j=0;j<array3[i].length;j++) {
				System.out.print(array3[i][j]+" ");
			}
			System.out.println();
		}
			
			
	}

}
