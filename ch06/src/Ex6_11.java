class Data_1 {
	int value;
//    Data_1() {} //기본 생성자를 추가. 없어도 컴파일러가 자동추가
//	  생성자가 하나도 없을 때만 자동으로 생성
}

class Data_2 {
	int value;
    Data_2() {} //기본 생성자. 없으면 에러남
	Data_2(int x) {   // 매개변수가 있는 생성자.
		value = x;
	}
}

class Ex6_11 {
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(); // compile error발생.
		//The constructor Data_2() is undefined. // Data_2()의 생성자가 없다.
	}
}