package Report;
import java.util.*;
public class report_27 {

	public static void main(String[] args) {
//		15. 사용자로부터 키를 입력받아서  표준 체중을 계산한 후에 사용자의 체중과 비교하여 
//		저체중인지, 표준인지, 과체중인지를 판단하는 프로그램을 작성하라. 
//		표준 체중 계산식은 다음을 사용하라. 
//		표준 체중 = (키 - 100) * 0.9�司哲�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하시오: ");
		double h = sc.nextDouble();
		System.out.print("몸무게를 입력하시오: ");
		double w = sc.nextDouble();

		double avg = (h-100)*0.9;
		System.out.printf("표준체중은 %.1f\n",avg);
		
		if (w > avg) {
			System.out.println("과체중 입니다.");
		} 
		else if (w < avg) {
			System.out.println("저체중 입니다.");
		}
		else {
			System.out.println("정상 입니다.");
		}
		
		
	} // end of main

} // end of class
