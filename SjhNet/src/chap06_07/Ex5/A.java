package chap06_07.Ex5;

	//접근 제어자 : Public , protected, default, private
		// 클래스 이름, 필드명, 메소드명, 생성자명	<<== 접근 제어자가 반드시 할당이 되어있습니다.
 		// 클래스 이름 :  default, Public

public class A {

	int  m = 3;			// 필드의 기본 접근 제어자는 default : 생략됨, 같은 패키지 내 다른 클래스에서 접근가능
	int  n = 4;			// default : 다른 패키지의 클래스에서는 접근 불가.
	
								// private : 외부 클래스에서 접근을 불가
	
	
	public int k = 10; 		//다른패키지에서 접근이 가능
		
	
	
	void prit () {			// 
		System.out.println("임포트 성공" + m + " , " + n);
	}
	
	public void print2 () {
		System.out.println("외부 패키지의 클래스에서 접근 가능" + k);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
