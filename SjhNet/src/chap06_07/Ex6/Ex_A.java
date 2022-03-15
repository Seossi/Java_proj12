package chap06_07.Ex6;

import chap06_07.Ex5.A;

public class Ex_A {

	public static void main(String[] args) {
		// 다른 패키지에 있는 객체를 사용하는 방법 :
		
		// 1.전체 클래스 이름을 사용하는 방법

		chap06_07.Ex5.A a = new chap06_07.Ex5.A();
		
		a.k = 50; 		// public : 다른 패키지의 클래스에서 접근이 가능
		a.print2(); 	// public 
		
		// 2. import 를 사용해서 접근하는 방법
		A aa = new A();      // 마우스 오버로 임포트 선택
		aa.k = 100;
		aa.print2();		 // public : 다른 패키지의 클래스에서 접근가능
		
	}

}
