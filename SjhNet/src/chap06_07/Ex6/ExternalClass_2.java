package chap06_07.Ex6;

import chap06_07.Ex5.Bb;			// Ŭ���� B�� Ŭ���� �����ڰ� default �̱� ������ �ٸ� ��Ű������ ���� �Ұ�.


public class ExternalClass_2 {

	public static void main(String[] args) {
		// B b = new B();
		
		// �ٸ� ��Ű���� Ŭ�������� BbŬ������ �����ϴ� ���
			// 1. import �� ���� ���.
			// 2. Bb Ŭ������ Ŭ���� ���� �����ڴ� public
			// 3. �ʵ�, �޼ҵ��� ���� �����ڿ� ���� ������ ���� (protected, public) , �Ұ���
		
		

		Bb bb = new Bb();
		
		//bb.a = 10;		//private : ���� ��Ű�� �������� ����
		//bb.b = 20;		//default : ���� ��Ű�� ������ ���� ����
		//bb.c = 30;		//protected : default ���� + �ٸ� ��Ű������ ���ٰ��� (��Ӱ���)
		bb.d = 40;		//public : protected + �ٸ� ��Ű������ ���ٰ���
		
		//bb.print4();		//private 
		//bb.print4();		//default
		//bb.print4();		//protected  �ܺ��� �ٸ� ��Ű���� �����Ϸ��� ��Ӱ��� �ʿ�
		bb.print4();
	}

}
