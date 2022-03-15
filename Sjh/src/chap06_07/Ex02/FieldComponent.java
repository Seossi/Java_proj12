package Chap06_07.Ex02;

class abc {
	int m = 3;		// 필드 ( Heap 에 저장 )
	int n = 4;
	
	void work1() {			//메소드
		int k = 5 ;			// 지역변수 : (Stack 영역에 저장) .메소드 종료시 없어짐
		System.out.println(k);
		
		
		
	}
	
	void work2(int i) {
		int j =4; 		// 지역변수 (Stack 공간에 변수와 값이 저장)
		System.out.println(i + j);
		
		int i1  1;			// 지역변수 이므로 강제 초기화가 되지 ㅇ낳는다
	}
}





public class FieldComponent {

	public static void main(String[] args) {


			Abc abc = new Abc();  		//abc 객체 생성
	}

}
