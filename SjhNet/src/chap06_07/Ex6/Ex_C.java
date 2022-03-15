package chap06_07.Ex6;

import chap06_07.Ex5.C;			// class의 접근자가 piblic으로 되야함

public class Ex_C {

	public static void main(String[] args) {


		//다른 클래스에 존재함 / public 만 접근 / model, color 메모리로 접근이 불가능
		// model 과 color 는 setter를 public 통해서 할당후 출력 
		
		C c = new C(); // 다른 패키지에서 import 시켜야됨
		
		c.maxSpeed = 300;
		
		c.setModel("에쿠스");
		c.setColor("red");
		c.setCompany("")
		
		
		
	}

}
