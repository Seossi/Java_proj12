package Chap06_07.Ex02;

public class A {
		//1. ���� Ÿ���� ���� �޼ҵ� : void �޼ҵ��() { �����ڵ�}
		void print() {
			System.out.println("hi");
		}

		//2. ���� Ÿ���� �ִ� �޼ҵ� (����)
		int data () {
			return 3; 		// ���������� ����
		}

		//3. ���� Ÿ�� : double 
		
		double sum (int a , double b ) {
			return a + b;
		}
		
		
		//4. return Ÿ���� void + �޼ҵ� ���ο��� return�� ���� : �Լ��� ����
		void printMethod ( int m ) {
			if ( m < 0 || m > 12) {
				System.out.println("�߸��� �Է°��Դϴ�. 1~12������ �Է��� �����մϴ�.");

				return; 	//�޼ҵ带 �����Ѵ�
			}
			
			System.out.println(m + "���Դϴ�.");
		}
		
		
}	
