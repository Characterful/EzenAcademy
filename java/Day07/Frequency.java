package ezen;
import java.util.Scanner;
public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] scores = {0,0,0,0,0,0,0,0,0,0};
		int num;
		while(true) {
			System.out.print("점수입력> ");
			num=sc.nextInt();
			if(num == -1)
				break;
			else if(num >= 0 && num <= 9)
				scores[0]+=1;
			else if(num >= 10 && num <= 19)
				scores[1]+=1;
			else if(num >= 20 && num <= 29)
				scores[2]+=1;
			else if(num >= 30 && num <= 39)
				scores[3]+=1;
			else if(num >= 40 && num <= 49)
				scores[4]+=1;
			else if(num >= 50 && num <= 59)
				scores[5]+=1;
			else if(num >= 60 && num <= 69)
				scores[6]+=1;
			else if(num >= 70 && num <= 79)
				scores[7]+=1;
			else if(num >= 80 && num <= 89)
				scores[8]+=1;
			else if(num >= 90 && num <= 99)
				scores[9]+=1;
		}
		for(int i=0;i<scores.length;i++)
			System.out.println((i*10)+"~"+(i*10+9)+": "+scores[i]);
		sc.close();
	}

}
