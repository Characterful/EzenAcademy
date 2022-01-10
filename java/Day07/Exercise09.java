package ezen;
import java.util.Scanner;
public class Exercise09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run){
			System.out.println("----------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			if(studentNum == 0 && selectNo == 2) {
				System.out.println("학생수를 입력 받은 후 점수 입력이 가능합니다");
			}else if((studentNum == 0 || scores == null) && selectNo == 3){
				System.out.println("학생수와 점수를 입력 받은 후 점수 리스트를 확인하세요");
			}else if((studentNum == 0 || scores == null) && selectNo == 4){
					System.out.println("학생수와 점수를 입력 받은 후 점수 분석을 확인하세요");
			}else if(selectNo == 1){
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
			}else if(selectNo == 2){
				scores = new int[studentNum];
				for(int i=0;i<scores.length;i++){
					System.out.print("score["+i+"]>");
					scores[i]=scanner.nextInt();
				}
			}else if(selectNo == 3) {
				
				for(int i=0;i<scores.length;i++)
					System.out.println("score["+i+"]: " + scores[i]);
				
			}else if(selectNo == 4) {
				int sum=0;
				double avg=0.0;
				int max=scores[0];
				for(int i=0;i<scores.length;i++) {
					sum+=scores[i];
					if(max<scores[i])
						max=scores[i];
				}
					
				avg=1.0*sum/scores.length;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			}else if(selectNo == 5) {
				run  = false;
			}
		}
		
		System.out.println("프로그램 종료");
		scanner.close();
	}
	
}
