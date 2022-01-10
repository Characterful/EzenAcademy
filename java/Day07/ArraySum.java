package ezen;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {30, 20, 11, 55, 88, 12, 3, 6, 59, 29};
		
		System.out.println("배열의 합:" + sumArray(a));
		
	}
	public static int sumArray(int[] a) {
		int sum=0;
		for(int i:a)
			sum+=i;
		return sum;
		
	}
}
