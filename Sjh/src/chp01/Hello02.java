package chp01;
public class Hello02 {
	// �޼ҵ� ���� (�޼ҵ�: ��ü������� �Լ�( input ���� �־ ���α׷��� ���� ��������)�� �޼ҵ��� ȣĪ�Ѵ�.)
	public static int sum (int n, int m) {
		return n+m;
	}
	
	public static void main(String[] args) {
		//���� ����
		
		int i = 20;				// i������ ������ ���� �� �ְ�, �ʱⰪ���� 20�� �Ҵ��ؼ� ����
		int s ;					// s������ �������� ���� �� �ְ�, �ʱⰪ�� �����
		char a ;				// a������ �ѱ��ڸ� ���� �� �ִ�, (�ƽ�Ű��) , '(���� ����ǥ�� ����ؼ� ���� �Ҵ�)
		String b ;
		
		b="������ ������ �����ϴ�.";
		
		
		
		s = sum (i,10); //sum() mathod ȣ��
		a = '?';
		System.out.println(a);
		System.out.println("hello");
		System.out.println(s);
		System.out.println(b);
		
	}

}
