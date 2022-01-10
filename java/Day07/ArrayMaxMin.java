package ezen;

public class ArrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {30, 20, 11, 55, 88, 12, 3, 6, 59, 29};
		System.out.println("최고값: "+minA(a)+" 최저값: "+maxA(a));
	}
	public static int minA(int[] a) {
		int min=a[0];
		for(int i:a)
			if(min>i)
				min=i;
		return min;
		
	}
	public static int maxA(int[] a) {
		int max=a[0];
		for(int i:a)
			if(max<i)
				max=i;
		return max;
	}
}
