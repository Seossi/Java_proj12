package Chap06_07.Ex02;

// �޼ҵ� �����ε� : �ϳ��� �޼ҵ�� �Ű����� Ÿ�ٿ� ���� ���� �ٸ� �޼ҵ尡 ȣ���  ( java)
// �޼ҵ� �������̵� : ��ӿ��� �θ� Ŭ������ �޼ҵ带 ������ �ؼ� ���	



//�پ��� Ÿ���� �޼ҵ� ���� (����Ÿ���� �ִ°�� ( int , double, String ...), ����Ÿ���� ���°�� voidŰ�� ���

public class ExternalCallMethods {

	public static void main(String[] args) {


		
		//��ü����
		A a = new A();  		// ���� ��Ű�� ���� Ŭ������ import ���� ȣ���ؼ� ��밡��.
		
		
		//�޼ҵ� ȣ��
		a.print();
		int k = a.data();		//3�� ����
		System.out.println(k);
		
		double result = a.sum(3, 5.2);
		System.out.println();
		
		a.printMethod(5);
		a.printMethod(50);
		
		
		System.out.println(a.data());  //��±����� ȣ�� ������ �޼ҵ� ( ������ �ִ� �޼ҵ�,)
		// System.out.println(a.print());  // ���ϰ��� ���� �޼ҵ�� �����߻�//
		a.print();
		System.out.println(a.sum(4,10.5));
	//	System.out.println(a.printMethod(3));     // �����߻�
		
		a.printMethod(3);
	
	
	}

}
