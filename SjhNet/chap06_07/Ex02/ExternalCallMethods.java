package Chap06_07.Ex02;

// 메소드 오버로딩 : 하나의 메소드명에 매개변수 타잎에 따라서 각각 다른 메소드가 호출됨  ( java)
// 메소드 오버라이딩 : 상속에서 부모 클래스의 메소드를 재정의 해서 사용	



//다양한 타입의 메소드 형식 (리턴타입이 있는경우 ( int , double, String ...), 리턴타입이 없는경우 void키를 사용

public class ExternalCallMethods {

	public static void main(String[] args) {


		
		//객체생성
		A a = new A();  		// 같은 패키지 내의 클래스는 import 없이 호출해서 사용가능.
		
		
		//메소드 호출
		a.print();
		int k = a.data();		//3이 리턴
		System.out.println(k);
		
		double result = a.sum(3, 5.2);
		System.out.println();
		
		a.printMethod(5);
		a.printMethod(50);
		
		
		System.out.println(a.data());  //출력구문에 호출 가능한 메소드 ( 리턴이 있는 메소드,)
		// System.out.println(a.print());  // 리턴값이 없는 메소드는 오류발생//
		a.print();
		System.out.println(a.sum(4,10.5));
	//	System.out.println(a.printMethod(3));     // 오류발생
		
		a.printMethod(3);
	
	
	}

}
