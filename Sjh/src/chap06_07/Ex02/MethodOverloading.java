package Chap06_07.Ex02;


class B {
	static String name = "BTS";
	
	static void print () {
			System.out.println(name);
			System.out.println("static�� ���� �޼ҵ� �Դϴ�.");
		
	}
			
}

public class MethodOverloading {

	public static void main(String[] args) {
		// �޼ҵ� �����ε� : �ϳ��� �޼ҵ�� �Ű����� Ÿ�ٿ� ���� ���� �ٸ� �޼ҵ尡 ȣ���  ( java)
		// �޼ҵ� �������̵� : ��ӿ��� �θ� Ŭ������ �޼ҵ带 ������ �ؼ� ���	
		
		// Static: ��ü ���� ���� �ٷ� ȣ���ؼ� ��밡��
		
		
		System.out.println(B.name);		//��ü�̸��� �ƴ�
		B.print();						// Ŭ���� �̸����� ȣ��
		
		System.out.println("==============================");
		
		print1(); 		// Static Ű�� �� �ְ� ������ Ŭ������ ������ �޼ҵ�� �ٷ� ȣ�Ⱑ��
		print1(3); 		// �Ű������� 1���̰� ����Ÿ���� �޼ҵ带 ȣ��
		print1(30.8);	//  �Ű������� 1���̰� double Ÿ���� �޼ҵ� ȣ��
		print1(2,5);	// �Ű� ������ 2���̰� int , int  Ÿ���� �޼ҵ� ȣ��
		
		
		
		}
		
	
	
	
	// �޼ҵ� �������̵� : �޼ҵ� �̸��� ���� , �Ű����� Ÿ��, �Ű����� ������ ���� �ش� �޼ҵ带 ȣ�� 
	//JVM �� ������ �޼ҵ� �̸��� ������ Ÿ���̳� ������ ���� �ش� �޼ҵ带 �̵�
	// ���� : ������ �Ű����� Ÿ�԰� ������ ������ ������ �߻� ��Ŵ 
	public static void print1 () {			//
		System.out.println("�����Ͱ� �����ϴ�.");
	}
	
	public static void print1 (int a) {			//
		System.out.println("���� :" +a);
	}		
	
	public static void print1 (double a) {			//
		System.out.println("double" +a);
	}	
	
	/* public static void print1 (double k ) {    //�Ű� ������ 1, ������ Ÿ���� double
		System.out.println(k);
	}
			�����߻� : ������ ������ Ÿ��, ������ ������ �޼ҵ尡�� �����ϴ� ���
	*/
	
	
	
	public static void print1 (int a, int b) {			//
		System.out.println(" a : " + a + "," + b + "b");
	}	
	
		
	
	
	
	
}
