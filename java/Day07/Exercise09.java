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
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("----------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = scanner.nextInt();
			if(studentNum == 0 && selectNo == 2) {
				System.out.println("�л����� �Է� ���� �� ���� �Է��� �����մϴ�");
			}else if((studentNum == 0 || scores == null) && selectNo == 3){
				System.out.println("�л����� ������ �Է� ���� �� ���� ����Ʈ�� Ȯ���ϼ���");
			}else if((studentNum == 0 || scores == null) && selectNo == 4){
					System.out.println("�л����� ������ �Է� ���� �� ���� �м��� Ȯ���ϼ���");
			}else if(selectNo == 1){
				System.out.print("�л���> ");
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
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + avg);
			}else if(selectNo == 5) {
				run  = false;
			}
		}
		
		System.out.println("���α׷� ����");
		scanner.close();
	}
	
}
