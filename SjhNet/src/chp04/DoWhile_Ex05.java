package chp04;

public class DoWhile_Ex05 {

	public static void main(String[] args) {

		// 1. While ���� Do While  ���� �� : ������ 0�� ���
		
		System.out.println();
		System.out.println("==========�ݺ� Ƚ���� 0�ΰ��==========");
		
		int a = 0 ;
		while (a < 0 ) { 			// ������ true �϶� ����
			System.out.print(a+" ");
			a++;
		}

		
		System.out.println();
				
		a = 0;
		do {
			System.out.print(a + " ");    //do while ������ ������ 1ȸ ����
			a++;
		
		} while (a < 0);   // ������  false // ������ true �� ���� ���� 
		
		
		System.out.println();
		System.out.println("==========�ݺ�Ƚ���� 1�ΰ��==========");
				
		
		//2. �ݺ� Ƚ���� 1�� ���
		
		a = 0;
		while ( a < 1 ) {
			System.out.print( a + " ");
			a++;
		}
		
		
		
		System.out.println();
				
		
		a = 0;
		
		do {
			System.out.print( a + " " );
			a++;
			
		} while ( a > 1);
		
		System.out.println();
		System.out.println("==========10ȸ �ݺ�==========");
		
		// �ݺ� Ƚ���� 10���� ���
		
		a = 0;
		while (a < 10)	{
			System.out.print(a + " ");
			a++;
			
		}
		System.out.println();
		
		a = 0;
		do { 
			System.out.print( a+" ");
			a++;
		} while ( a < 10);
		
		
		
		
		
		
		
		
		
		
	}

}
