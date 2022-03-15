package Home;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		
		System.out.print(" 성적을 입력하세요!");
		
		int value3 = scanner.nextInt(); 

		System.out.print("당신의 학점은! ");
						
				
		

	
		if (value3 >= 90) {
			 System.out.println("A학점 , 점수 : " + value3);
		}	else if (value3 >= 80) {
			System.out.println("B학점, 점수 : " + value3);
			
		} 	else if (value3 >= 70 ) {
			System.out.println("C학점, 점수 : " + value3);
			
		}   else {
			System.out.println("F학점, 점수 : " + value3);
		}
		
								
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


