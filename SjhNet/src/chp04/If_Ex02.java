package chp04;

import java.util.Scanner;

public class If_Ex02 {

	public static void main(String[] args) {
		
		
		System.out.println("num1, num2, �����ڸ� �Է��� �ּ���." );
		Scanner sc = new Scanner (System.in);

		Object num1;
		System.out.println( "��� ���� :"+ (num1 operator num2) + " �Դϴ�.");
		
		Scanner scanner;
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		char operator = charAt(0);
		



		switch (sc.next().charAt(0)) 
		
		
		int num = scanner.nextInt();
		
		
		
	/*	default :
		System.out.println("������ �����Դϴ�.");
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
		System.out.println("���ڿ��� ��������");
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		char operator = sc.next().charAt(0);
		
		switch (operator) {
		case '+':
			System.out.println("������� : " + (num1 + num2)+ " �Դϴ�. ");
			break;
		case '-':
			System.out.println("������� : " + (num1 - num2)+ " �Դϴ�. ");
			break;
		case '*':
			System.out.println("������� : " + (num1 * num2)+ " �Դϴ�. ");
			break;
		case '/':
			System.out.println("������� : " + (num1 / num2) + " �Դϴ�. ");
			break;
		default:
			System.out.println("������ �����Դϴ�.");
		} 
		sc.close();
	} 
}
