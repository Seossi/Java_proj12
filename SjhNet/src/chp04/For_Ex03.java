package chp04;

public class For_Ex03 {

	public static void main(String[] args) {

		//for �⺻����
		
		int a;		//���� ����, ��� �ۿ��� ����� ����, ���� ( 0) , �ʱⰪ (X)
		for ( a = 0 ; a < 10 ;  a++)	{
		System.out.print(a + " ");		 // for ���� �ۿ��� ����
		}
		
		//System.out.println(a);
		
		
		System.out.println();
		System.out.println("��� �ۿ��� ��� : " + a );
		System.out.println("================");

		for (int b = 0 ; b <= 10 ; b++ ) {
			System.out.print(b + " " );
		}
		
		System.out.println();
		System.out.println("================");

		// System.out.println(b);			// for ��  �������� ��ȿ��. (����)
		
		int  c ;
		for ( c = 10 ; c > 0 ; c--) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("================");

		
		// 2�� ��� ���
		
		for ( int i = 0 ; 100 > i ; i += 2) {
			System.out.print(i + " ");
		}


		/* for�� ������ �ʱⰪ�� �������� ���� ������ �Ҵ� �� �� �ִ�.*/ 
	
		
		for (int i=0, j = 0 ; i < 10 ; i++, j++) {
			System.out.println(i + " * " + j + " : " + (i*j));
		}


		//* for ���� ����ؼ� 1 ����  10 ���� * ���� ����� ������. ( 1* 2* 3* 4 *...10)
		
		int s=1;
		for ( int i =1; i <= 10 ; i++) {
			s *= i ;		// s = s*i
		}
		System.out.println("1���� 100���� ���Ѱ� : " + s);
		
			
		// for ���� ����ؼ� 1���Ѱ� 100���� ���Ѱ��� ����غ�����
	
					
		int sum = 0;
		for (int i =1 ; i <= 100 ; i++) {
			sum += i;
		}
		System.out.println("1���� 100���� ���Ѱ� :" + sum);
		
		
		/*���� for ��  : 1�� ~�� ���� ������ ���  */
		
		System.out.println("==============������ ���============");
		
		for ( int i = 1; i <= 9 ; i++) {	 //i :���� ���
			for ( int j = 1; j <= 9 ; j++) {	 //i :���� ���

			System.out.println( i + " * " + j + " = " + ( i * j));
			
			}
			System.out.println("===============================");
						
		}
		
		/*
		 * for ������ ���� ���� �߻� , ������ ���� ���
		 * 
		 * 
		 */
		/* for ( int i = 0 ; ; i++) {
			System.out.println( i + " ");  //0, 1, 2,...
		*/
		
		/*
		for ( ; ; ) {
			System.out.println("���ѷ���");
						
		}
		*/
		
		System.out.println("==================================");
		
		// ���� ���� Ż��

		for ( int i = 0; ; i++) {
			if ( i > 100) {
				break;    	// ���ѷ��� ��������
			}
			System.out.println( i );
		}
		
		/* for  ���� ����ؼ� 1���� 1000���� 4�� ����� ���� ��: ��հ� : double ��
		 * 
		*/
		
		double sum1 = 0 ;   // ���Ѱ��� �����ϴ� ����
 		int j = 0 ;  	//4�� ����� ī��Ʈ �ϴ� ����
 		
 		for ( int i = 1; i <= 1000 ; i++) {
 			if ( i % 4 == 0) {
 				sum1 += i ;    // sum + sum +i  // 4�� ����� ���Ѵ�.
 				j++;
 			}
 		}
 		System.out.println("���� : " + sum1 );
 		System.out.println("����� : " + sum1 / j );
 		System.out.println(j);


		
		
		
	}
}
