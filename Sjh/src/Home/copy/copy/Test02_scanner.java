package Home.copy.copy;

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


