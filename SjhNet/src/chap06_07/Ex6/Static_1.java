package chap06_07.Ex6;

class Aaa{
	int m = 3;			// �ʵ� (�ν��Ͻ� �ʵ�) : ��ü�� �����ؾ� ��밡��
	static int n = 4;	// �ʵ� (����ƽ �ʵ�) : ��ü �������� ��밡�� , ��ü ���� �Ŀ��� ����� ����
						// ��� ��ü�� �����ϴ� ���� 
	
	void print1 () {	// �޼ҵ� (�ν��Ͻ� �޼ҵ�) : ��ü�� ������ ȣ�Ⱑ��
		
		// �ν��Ͻ� �ʵ��, static �ʵ尡 �� �� �ִ�.
		System.out.println( " �ν��Ͻ� �޼ҵ� ���" + " : m" + m + " , n : " + n);
			
	}
	
	 static void print2() {		// �޼ҵ� (static �޼ҵ�) : ��ü �������� ȣ�Ⱑ��, ��ü �����Ŀ��� ȣ�Ⱑ��
		 
		 // ����ƽ �޼ҵ� �������� �ν��Ͻ� �ʵ尡 �ü� ����. static �ʵ常 ����.
		 
		 // static �޼ҵ�� ��ü �������� ȣ���� �ǹǷ� �ν��Ͻ� �ʵ尡 �� �� ����.
		 
		 
		 System.out.println(" static �޼ҵ� ��� : " + "  n : " + n);
	 }
	 
	
	 
	 
	
	
}




public class Static_1 {

	public static void main(String[] args) {
		
		
		
		// 1. ��ü ���� �� �ʵ�� �޼ҵ� ȣ��	( �ν��Ͻ� �ʵ�, ����ƽ �ʵ�, �ν��Ͻ� �޼ҵ�, ����ƽ �޼ҵ� ��� ȣ��)
		
		Aaa aaa = new Aaa();
		aaa.m =10;	 	// �ν��Ͻ� �ʵ� ȣ��
		aaa.n= 20; 		// static �ʱ� ȣ��
		aaa.print1();	// �ν��Ͻ� �޼ҵ� ȣ��
		aaa.print2();   // static �޼ҵ� ȣ��
		
		
	
		
		//2. ��ü �������� �ʵ�� �޼ҵ� ȣ��
		
		Aaa.n = 100; 	//static �ʵ� : Ŭ���� ������ ȣ���
		Aaa.print2();   //static �޼ҵ� : Ŭ���� ������ ȣ���
		
		Aaa Bbb = new Aaa(); 
		
		System.out.println( Bbb.n);			//100
		
		Aaa ccc = new Aaa();
		System.out.println(ccc.n);			//100
		
		Aaa ddd = new Aaa();
		System.out.println(ddd.n); 			//100
		
		Aaa eee = new Aaa();
		System.out.println(eee.n);			//100
		
		eee.n= 300;
		System.out.println("===========static �ȵ尡 ����� �ʵ�� ��� ��ü���� �������� �ٶ󺸴� ����=============");
		
		System.out.println(Bbb.n);
		System.out.println(ccc.n);
		System.out.println(ddd.n);
		System.out.println(eee.n);
		
	}

}