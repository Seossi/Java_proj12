package chap06_07.Ex6;

import chap06_07.Ex5.A;

public class Ex_A {

	public static void main(String[] args) {
		// �ٸ� ��Ű���� �ִ� ��ü�� ����ϴ� ��� :
		
		// 1.��ü Ŭ���� �̸��� ����ϴ� ���

		chap06_07.Ex5.A a = new chap06_07.Ex5.A();
		
		a.k = 50; 		// public : �ٸ� ��Ű���� Ŭ�������� ������ ����
		a.print2(); 	// public 
		
		// 2. import �� ����ؼ� �����ϴ� ���
		A aa = new A();      // ���콺 ������ ����Ʈ ����
		aa.k = 100;
		aa.print2();		 // public : �ٸ� ��Ű���� Ŭ�������� ���ٰ���
		
	}

}
