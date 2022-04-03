import java.util.*;

public class Ex4_20 {

	public static void main(String[] args) {
		int menu = 0, num = 0;
		Scanner scanner = new Scanner(System.in);
		
		outer: // while문에 outher라는 이름을 붙인다.
		while(true) {
			System.out.println("(1) square");	
			System.out.println("(2) square root");	
			System.out.println("(3) log");	
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");	
			
			String tmp = scanner.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp); 	 // 입력받은 문자열 (tmp)을 숫자로 변환
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				continue;
			} // end of if
			
			for(;;) { // 무한 반복문
				System.out.println("계산할 값을 입력하세요.(계산 종료:0, 전체종료:99)>");
				tmp = scanner.nextLine(); 	 // 화면에서 입력받은 내용을 tmp에 저장
				num = Integer.parseInt(tmp); // 입력받은 문자열 (tmp)을 숫자로 변환
				
				if(num==0)
					break;   		// 계산 종료. for문을 벗어난다.
				
				if(num==99)
					break outer;    // 전체 종료. for문과 while문을 모두 벗어난다.
				
				switch(menu) {
					case 1:
						System.out.println("result=" + num*num);
						break;
					case 2:
						System.out.println("result=" + Math.sqrt(num));
						break;
					case 3:
						System.out.println("result=" + Math.log(num));
						break;
						
				} // end of switch
			} // end of for
		} // end of outer while
		System.out.println("프로그램이 종료되었습니다.");
	} // end of main
} // end of class
