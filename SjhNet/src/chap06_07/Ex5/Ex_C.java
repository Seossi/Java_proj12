package chap06_07.Ex5;

public class Ex_C {

	public static void main(String[] args) {

		// 같은 클래스에 존재함.
		
		C c = new C(); 	// 같은 패키지에 존재하는 클라스
		
		c.model = "그랜져"; 
		c.color = "검정";
		c.maxSpeed = 250;
		// c.company = "현대자동차";
		
		c.print();
		
		
		
		
		
	}

}
