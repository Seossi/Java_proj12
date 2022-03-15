package Chap06_07.Ex02;

public class DffectOfRrimearyDataArguejment {
		int abc ; 	//필드 : ( Heap 영역에 저장 , 객체화를 시켜야 사용가능)
	
	
	
	
	static int twice (int a) {		// 정수를 받아서 *2 한 값을 리턴
		a = a * 2;		// a : 변수는 메소드가 종료될때 삭제
		return a;		// 메소드가 종료되면 없어짐
				
				
				
	}
		
	
	public static void main(String[] args) {

		int a = 3;
		int result1 = twice(3);
		System.out.println(result1); //6		

		int result2 = twice(a);
		System.out.println(result2); //6 
		System.out.println(a);	 //3
		
		
		
		
	}

}
