package Chap06_07.Ex02;

public class InternalCallMethod {

	public static void main(String[] args) {
		// 같은 클래스 안에서 내부 메소드 호출

		InternalCallMethod aaa = new InternalCallMethod();
		
		aaa.print();
		
		int a = aaa.twice(3);
		System.out.println(a);		//6
		
		double b = aaa.sum(a, 5.8);
		System.out.println(b);
								
		
	}

	

	void print() {			//static 키워득가 없이 메소드 생성, 객체화 시켜서 메소드 호출
		
		System.out.println("안녕");
		
		
	}
	
	int twice ( int k ) {
		return k *2 ;
	}
	double sum ( int m , double n) {
		return m + n ;
		
		
	}
		
		
	}
	
	
	

