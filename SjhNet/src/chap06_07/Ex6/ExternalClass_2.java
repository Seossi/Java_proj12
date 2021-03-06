package chap06_07.Ex6;

import chap06_07.Ex5.Bb;			// 클래스 B는 클래스 접근자가 default 이기 때문에 다른 패키지에서 접근 불가.


public class ExternalClass_2 {

	public static void main(String[] args) {
		// B b = new B();
		
		// 다른 패키지의 클래스에서 Bb클래스를 접근하는 경우
			// 1. import 를 먼저 사용.
			// 2. Bb 클래스의 클래스 접근 제한자는 public
			// 3. 필드, 메소드의 접근 제한자에 따라서 접근이 가능 (protected, public) , 불가능
		
		

		Bb bb = new Bb();
		
		//bb.a = 10;		//private : 같은 패키지 내에서만 접근
		//bb.b = 20;		//default : 같은 패키지 내에서 접근 가능
		//bb.c = 30;		//protected : default 포함 + 다른 패키지에서 접근가능 (상속관계)
		bb.d = 40;		//public : protected + 다른 패키지에서 접근가능
		
		//bb.print4();		//private 
		//bb.print4();		//default
		//bb.print4();		//protected  외부의 다른 패키지로 접속하려면 상속관계 필요
		bb.print4();
	}

}
