package Chap06_07.Ex02;

public class DffectOfRrimearyDataArguejment {
		int abc ; 	//�ʵ� : ( Heap ������ ���� , ��üȭ�� ���Ѿ� ��밡��)
	
	
	
	
	static int twice (int a) {		// ������ �޾Ƽ� *2 �� ���� ����
		a = a * 2;		// a : ������ �޼ҵ尡 ����ɶ� ����
		return a;		// �޼ҵ尡 ����Ǹ� ������
				
				
				
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
