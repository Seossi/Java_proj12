package chap06_07.Ex5;

public class Bb {
	
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
	public static void main(String[] args) {

	}

}


