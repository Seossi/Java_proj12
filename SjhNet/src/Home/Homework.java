package Home;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		
		System.out.print(" ������ �Է��ϼ���!");
		
		int value3 = scanner.nextInt(); 

		System.out.print("����� ������! ");
						
				
		

	
		if (value3 >= 90) {
			 System.out.println("A���� , ���� : " + value3);
		}	else if (value3 >= 80) {
			System.out.println("B����, ���� : " + value3);
			
		} 	else if (value3 >= 70 ) {
			System.out.println("C����, ���� : " + value3);
			
		}   else {
			System.out.println("F����, ���� : " + value3);
		}
		
								
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


