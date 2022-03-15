package Chap06_07.Ex02;

public class A {
		//1. 리턴 타잎이 없는 메소드 : void 메소드명() { 실행코드}
		void print() {
			System.out.println("hi");
		}

		//2. 리턴 타입이 있는 메소드 (정수)
		int data () {
			return 3; 		// 정수값으로 리턴
		}

		//3. 리턴 타입 : double 
		
		double sum (int a , double b ) {
			return a + b;
		}
		
		
		//4. return 타잎이 void + 메소드 내부에서 return을 포함 : 함수를 종료
		void printMethod ( int m ) {
			if ( m < 0 || m > 12) {
				System.out.println("잘못된 입력값입니다. 1~12까지만 입력이 가능합니다.");

				return; 	//메소드를 종료한다
			}
			
			System.out.println(m + "월입니다.");
		}
		
		
}	
