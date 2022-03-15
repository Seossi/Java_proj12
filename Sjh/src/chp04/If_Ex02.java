package chp04;

import java.util.Scanner;

public class If_Ex02 {

	public static void main(String[] args) {
		
		
		System.out.println("num1, num2, 연산자를 입력해 주세요." );
		Scanner sc = new Scanner (System.in);

		Object num1;
		System.out.println( "결과 값은 :"+ (num1 operator num2) + " 입니다.");
		
		Scanner scanner;
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		char operator = charAt(0);
		



		switch (sc.next().charAt(0)) 
		
		
		int num = scanner.nextInt();
		
		
		
	/*	default :
		System.out.println("연산자 오류입니다.");
		break;
		}
		*/
		
		scanner.close();
		
		
	}


		
	

}




package Test;

import java.util.Scanner;

public class Test02_scanner {
	public static void main(String[] args) {
		System.out.println("문자열을 넣으세요");
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		char operator = sc.next().charAt(0);
		
		switch (operator) {
		case '+':
			System.out.println("결과값은 : " + (num1 + num2)+ " 입니다. ");
			break;
		case '-':
			System.out.println("결과값은 : " + (num1 - num2)+ " 입니다. ");
			break;
		case '*':
			System.out.println("결과값은 : " + (num1 * num2)+ " 입니다. ");
			break;
		case '/':
			System.out.println("결과값은 : " + (num1 / num2) + " 입니다. ");
			break;
		default:
			System.out.println("연산자 오류입니다.");
		} 
		sc.close();
	} 
}
