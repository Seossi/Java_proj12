package chp04;

public class Switch_Ex02 {

	public static void main(String[] args) {

		//1. switch 문에서  break를 처리 하지않을때 : 해당 case로 이동한ㄹ후 하위 모두 실행
		
		
		int value1 = 3;
		
		switch (value1) {
		case 1:
			System.out.println("A학점");
			
		case 2:
			System.out.println("B학점");
			
		case 3:
			System.out.println("C학점");
		
		default :
			System.out.println("F학점");
		}
		System.out.println("=========================");
		
		//2. switch 에 brake 가 포함된 경우
		
		
		int value2 = 3;
		
		switch (value2) {
		case 1:
			System.out.println("A학점");
			break;
		case 2:
			System.out.println("B학점");
			break;
		case 3:
			System.out.println("C학점");
			break;
			
		default :
			System.out.println("F학점");
		}
		System.out.println("=========================");
		
		value2 = 2;

		if (value2 == 1) {
				System.out.println("A학점(if)");
				
		} else if (value2 == 2) {
				System.out.println("B학점(if)");				
		} else if (value2 == 3) {
				System.out.println("C학점(if)");
		} else { 
			System.out.println("F학점(if)");
		}
		System.out.println("=========================");
		
		
		/*
		 * switch문을 사용해서 정수가 7점 이상은 pass,7점 이하는 fail 을 출력 (정수 : 1 ~ 10)
		 * 
 		 */
		
		int a = 10;
		
		switch (a) {
		case 10:
		case 9:
		case 8:
		case 7:
			System.out.println("pass");
			break;
		default :
			System.out.println("fail");
		}
		
		
	}

}
