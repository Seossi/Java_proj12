package chap03;

public class ArithmeticOperater {

	public static void main(String[] args) {
		
		// ++ �� 1�� ���� , 
		int a = 3;
		++a;
		System.out.println(a);
		
		int b = 3;
		b++;
		System.out.println(b);
		
		System.out.println("===============");
		
		int a1 = 3;
		int b1 = ++a1;				// a1�� ���� 1���� ��Ű�� -->���� ��Ų ���� b1�� ���� �Ҵ�.
		System.out.println(a1);
		System.out.println(b1);

		int a2 = 3;
		int b2 = a2++;		 //a2 ���� b2�� �����ϰ� ---> a2�� ���� 1�� ���Ѵ�.  (������)
		System.out.println(a2);
		System.out.println(b2);
		
		System.out.println("==================");

		// ��� ������
		System.out.println( 2 + 3 );
		System.out.println( 8 -5 );
		System.out.println( 7 * 2 );
		System.out.println( 7 / 2 );       // �� �� �����ö��� int ������ ������ .~ �Ҽ��� ����
		System.out.println( 8 % 5 );		// ���� ������ ���� ���.
		
		System.out.println("2" + "3");      // +�� �� ���ڿ��� �����ϴ� ������

		// ���� ������ 
		int value1 = 3;
		value1++ ;
		System.out.println(value1);
		
		int value2 = 3;
		++value2;
		System.out.println(value2);
		System.out.println("=====================");
		
		
		
		// ���� ������ (case 2)
		
		int value3 = 3;
		int value4 = value3++;
		System.out.println(value3);
		System.out.println(value4);
		
		int value5 = 3;
		int value6 = ++value5;
		System.out.println(value5);
		System.out.println(value6);
		
		
		// ���� ������ (case 3)
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8;
		
		System.out.println(value7);
		System.out.println(value8);
		System.out.println(value9);
		System.out.println("==================");
		
		
		int value10 = 9;
		System.out.println(++value10);
		System.out.println(value10++);
		
		
		
	}

}