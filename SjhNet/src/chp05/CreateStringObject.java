package chp05;

public class CreateStringObject {

	public static void main(String[] args) {
		//1. String ��ü ���� 1 : new Ű�� ����ؼ� ��ü���� : Heap ������ ������ ������ ����
		// Ram �� ���� ���� �������� �ʴ´�.
		
		String str1 = new String("�ȳ�");	 	//new Ű�� ��ü�� �����϶�. (Heap �޸𸮿� ����)
		System.out.println( str1 ); 	// String�� ��ü�� ��������� ��ü�� ���� ���.
										// String �� ������ Ư���� ��� 
										// ��ü ��ü�� ��� �ϸ�, Heap �޸��� ������ ǥ��
										// ��ü�� ���� ����Ҷ��� ��ü��.toString() ������ 
		
		String str11 = new String("Hi");	// str1 �� str2 �� ������ �޸� ������ ���� (heap)
		
		if ( str1 == str11) {								// == : ���� �ڷ����϶�, �����ϴ� �ּҸ� ��.
			System.out.println(true);
		} else {
			System.out.println( false);						// false <== ������ �ּҸ� ����Ų��.	
		}
		
		System.out.println("=========================");
		
		
		
		
		 //2.  ���ͷ��� ���� �ٷ� �Ҵ� : ���� ���ϰ�� RAM �� ���� ���� �ϰ� �ȴ�. 
		String str2 = "�ȳ��ϼ���." ;
		String str22 = "�ȳ��ϼ���." ;  // ������ �޸� ������ ���� (heap)
		
		if ( str2 == str22) {		
			System.out.println(true);  	//true : ���� �ּҸ� ����Ų��.
		}else {
			System.out.println(false);
		}
		
		
		

	}

}
