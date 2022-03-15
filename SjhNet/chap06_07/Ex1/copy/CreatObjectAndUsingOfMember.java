package chap06_07.Ex1.copy;

// 클래스(class) : 설계도, 붕어빵 틀
// 객체 (object) : 클래스를 복사해서 RAM 에서 작동되는 실행코드 ( 집, 붕어빵틀 )
		// 객체 == 인스턴스 
		// 인스턴스화 ( 객체화) 시킨다. (메인 메소드에서 객체를 인스턴스화 시켜 줘야한다.)
		// A a = new A();   <== 클래스를 객체화 시켜서 메모리에 로드  


class A {   // 외부 클래스 (객체를 만들기 위한 설계도)
	int m = 3; 			// m : 필드 (변수) : 클래스 블럭에서 선언된 변수를 필드라 호칭.
						// 필드는 인스턴스화(객체) 시켜야 사용이 가능
						// 필드는 메모리에  Heap 영역에 생성
	
	void print() {		// 메소드 : 절차지향 언어의 함수 , 객체 지향에서 함수를 method라 호칭 
		System.out.println("객체 생성 및 활용");
	}
}


class B {	// 외부 클래스	 
	String Name = "홍길동";
	int age = 24;
	String phone = "010-1111-1111";
	
	void printName () {
		System.out.println(name);
	}	
	
	void printAge () {
		System.out.println(age);
	}
	void printPhone () {
		System.out.println(phone);
	
	}
}


public class CreatObjectAndUsingOfMember {

	public static void main(String[] args) {

		A a = new A();				//Class A 를 객체화(인스턴스화 == 메모리에 로드) 시킨다.
		System.out.println(a.m);	
		a.print();
		
		System.out.println("=====================");
		
		A b = new A();			// Class A 를 객체화 (인스턴스화) 시켜서 RAM에 로드
		
		System.out.println(b.m);
		b.print();
		
		A c = new A();
		System.out.println(c.m);
		c.print();
		
		System.out.println("======================");
		
		B bb = new B();		// B Class 를 bb 라는 이름으로 객체화 시킨다.
		bb.printName();		// bb 객체릐 메소드를 호출
		bb.printAge();		// bb 객케의 메소드 호출
		bb.printPhone();	
				
		B cc = new B();
		cc.printName();
		cc.printAge();
		cc.printPhone();
		
		
	}

}
