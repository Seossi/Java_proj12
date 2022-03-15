package chap06_07.Ex5;


class B {		// �ܺ� Ŭ���� : public �� �ü� ����. default �� �����Ǿ� �ִ�.
				// �ٸ� ��Ű���� Ŭ���������� ������ �Ұ�, ���� ��Ű�� �������� ���� ����
	
	private int a = 1;			// private : ���� Ŭ���� �������� ��
	int b = 2;					// default : ���� ��Ű������ �ٸ� Ŭ�������� ���� ����	
	protected int c = 3;		// protected : default ���� + �ٸ� ��Ű���� ���� ���� (��ӵ� ��츸 ����)
	public int d = 4;			// public : �ٸ� ��Ű������ ������ ����
	
			// private < default < protected < public
	
	private void print1 () {    // ���� Ŭ������ �����ϴ� �޼ҵ�
		a = 20;
		b = 20;
		c = 30;
		d = 40;
	}
	
	void print2() {		
		a = 20;
		b = 20;
		c = 30;
		d = 40;
	}
	
	protected void print3 () {
		a = 20;
		b = 20;
		c = 30;
		d = 40;
		
	}
	
	public void print4() {
		a = 20;
		b = 20;
		c = 30;
		d = 40;
	}
		
}

public class C { 	// ���� 
	
}


public class ExternalClass_1 {

	public static void main(String[] args) {


		B b = new B(); 		// ���� Ŭ������ �����ϹǷ� B class�� ������ �� �ִ�. << �����߻� : ������ �Ұ�>
		
		Bb bb = new Bb();
		
		
		// bb.a = 10; // private : ���� a �� Bb Ŭ���� 
		bb.b = 20;		// default :  ���� ��Ű���� Ŭ�������� ������ ���
		bb.c = 30;		// protected : default �� ����, + <<�ٸ���Ű������ ������ ���������� ��Ӱ����϶��� >>
		bb.d = 40;		// public : protected �� ���� + �ٸ���Ű������ ������ ����
		
		//�żҵ� ����
	//	bb.print1();	//private		: �����߻� , Ŭ���� ���ο����� ȣ��
		bb.print2();	//default
		bb.print3();	//protected
		bb.print4();    //public
	}

}
