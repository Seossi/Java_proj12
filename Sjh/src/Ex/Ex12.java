package Ex;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		/*
		 * [문항11]다음코드와같이과목과점수가짝을이루도록2개의배열을작성하라.
		 * String course[] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		 * int score[]  = {95, 88, 76, 62, 55};
		 * 그리고다음예시와같이과목이름을입력받아점수를출력하는프로그램을작성하라. "그만"을입력받으면종료한다. 
		 * (Java는인덱스0에있으므로score[0]을출력)과목이름>> Jaba없는과목입니다.
		 * 과목이름>> JavaJava의점수는95
		 * 과목이름>> 안드로이드안드로이드의점수는55
		 * 과목이름>> 그만[Hint]문자열을비교하기위해서는
		 * String 클래스의equals()메소드를이용해야한다.
		 * 
		 * String name;
		 * if(course[i].equals(name)) {
		 * int n = score[i];
		 * ...
		 * }
		 
		
		
		// String 에 값을 할당하는 2가지 방법
		
		// 생성자를  통해서 할당. // 별도의 메모리 할당.
		String aa = new String("안녕");
		String bb = new String("안녕");
		System.out.println(aa);				// 기본 자료형일때 : == (값을 비교)
		System.out.println(bb);				// 참조 자료형은 : == 가(동일함이 아님) "주소"를 비교
											// 참조 자료형일때 값을 비교 : str1.equals(str2) <== 참조변수 str1 값과 str2에 둘거아 있는 값을 비교.
											// String 에 값을 할당할때 생성자를 통해서 할당.
		if ( aa == bb) { 					// 메모리의 주소 값을 비교 ( aa, bb 는 다른 메모리 주소를 갇는다. 
			System.out.println(true);
		} else {
			System.out.println(false);		// false 츨력 가르키는 주소값이 다르다.
		}
		
		System.out.println("==================================");
		
		if (aa.equals(bb)) {				//메모리의 값을 비교할때 aa.equals.bb	
			System.out.println(true);		//true가 출력 ( 값을 비교 )
		} else {
			System.out.println(false);
		}
		
		
		
		String a = "안녕";
		String b = "안녕";
		
		if ( a == b) { 					// 참조 자료형에서 "==" : 메모리의 
			System.out.println(true);
		} else {
			System.out.println(false);
		}
				
		*/
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int[] score = { 95, 88, 76, 62, 55 };
		
		String name = null; // 스캐너로 과목의 문자열을 받는 변수
		int i = 0 ;     // 반번호를 담는 변수
		
		while ( true) { // 특정 조건을 만족할때 까지 계속 루프 돌아감.
			System.out.println("과목이름  : ");
			name = sc.next();    // 스캐너로 과목이름을 받아서 변수 name 에 할당.
			
			if ( name.equals("그만"))
				
		
	}
	
	
	
	
	
}
