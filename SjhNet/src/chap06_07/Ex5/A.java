package chap06_07.Ex5;

	//���� ������ : Public , protected, default, private
		// Ŭ���� �̸�, �ʵ��, �޼ҵ��, �����ڸ�	<<== ���� �����ڰ� �ݵ�� �Ҵ��� �Ǿ��ֽ��ϴ�.
 		// Ŭ���� �̸� :  default, Public

public class A {

	int  m = 3;			// �ʵ��� �⺻ ���� �����ڴ� default : ������, ���� ��Ű�� �� �ٸ� Ŭ�������� ���ٰ���
	int  n = 4;			// default : �ٸ� ��Ű���� Ŭ���������� ���� �Ұ�.
	
								// private : �ܺ� Ŭ�������� ������ �Ұ�
	
	
	public int k = 10; 		//�ٸ���Ű������ ������ ����
		
	
	
	void prit () {			// 
		System.out.println("����Ʈ ����" + m + " , " + n);
	}
	
	public void print2 () {
		System.out.println("�ܺ� ��Ű���� Ŭ�������� ���� ����" + k);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
