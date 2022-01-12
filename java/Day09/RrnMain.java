package ezen;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.*;

public class RrnMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String rrn;
		
		
		while(true) {
			System.out.print("주민번호 입력(-포함) >> ");
			rrn=sc.nextLine();
			
			if(rrn.length()!=14) {
				System.out.println("길이 오류!!"); continue;
			}
			
			if(!rrn.contains("-")) {
				System.out.println("-입력 오류"); continue;
			}
			
			int i=0;
			while(i<14) {
				if( (int)rrn.charAt(i) < 48  || (int)rrn.charAt(i) > 57 ) {
					System.out.println("숫자 오류");
					continue;
				}
				i++;
				if(i == 6) {
					i++;
				}
			}
			int year = ((int)rrn.charAt(0) - 48) * 10 + (int)rrn.charAt(1) - 48;
			int month = ((int)rrn.charAt(2) - 48) * 10 + (int)rrn.charAt(3) - 48;
			int day = ((int)rrn.charAt(4) - 48) * 10 + (int)rrn.charAt(5) - 48;
			if( (int)rrn.charAt(7) == 49 || (int)rrn.charAt(7) == 50 )
				year = year + 1900;
			else if((int)rrn.charAt(7) == 51 || (int)rrn.charAt(7) == 52) 
				year = year + 2000;
			
			try {
				LocalDate local=LocalDate.of(year, month, day);
				
			}catch(DateTimeException e) {
				System.out.println("날짜오류");
				continue;
			}
			
			if(!checkDigitCheck(rrn)) { 
				System.out.println("CDC오류");
				continue;
			}
			
			Rrn rn = new Rrn();
			rn.Setter(rrn);
			System.out.println(rn.printPRN());
			
			break;
		}
		sc.close();
		
	}
	static boolean checkDigitCheck(String rrn2) {
		int[] ch= {2,3,4,5,6,7,0,8,9,2,3,4,5};
		int[] r= new int[14];
		int i=0;
		
		while(i<13) {
			r[i]=(int)rrn2.charAt(i)-48;
			
			i++;
			if(i == 6) {
				r[i]=0;
				i=7;
			}
		}
		
		i=0;
		int sum=0;
		while(i<13) {
			sum=sum+ch[i]*r[i];
			i++;
			
		}
		
		sum=11-(sum%11);
		
		if(sum>=10)
			sum-=10;
		if((int)rrn2.charAt(13)-48 != sum) {
			return false;
		}else {
			return true;
		}
			
		
	}
}
