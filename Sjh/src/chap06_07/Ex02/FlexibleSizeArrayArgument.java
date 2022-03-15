package Chap06_07.Ex02;import java.util.Arrays;

public class FlexibleSizeArrayArgument {

	public static void main(String[] args) {
		// �迭�� ���̰� �������� �ʰ� ���������� ��� 
		// 1.method1 (int...values) <<== �������̸� ó���ϴ� input �Ű����� ����
		method1 ();
		method1 (1,2);
		method1 (1,2,3);
		method1 (1,2,3,4);
		method1 (1,2,3,4,5);
		method1 (1,2,3,4,5,6,7,8,9,10);
			
		//method2
		method2 ("�ȳ�" , "�氡");
		method2 ("��", "ȭ","��", "��", "��","��","��");
		method2 ("�䳢", "ȣ����", "����", "��");
		
		
		
	}
	static void method1 ( int ...values) {
		System.out.println(values.length);
		System.out.println("==========Array.toString(========= ");
		System.out.println(Arrays.toString(values));
		
		
		
		//for 
		for ( int i = 0 ; i < values.length ; i++){
			System.out.print( values[i] + " ");
			
		}
		
		for (int k : values) {
			
			System.out.print( k + " ");
		}
		
		
	}
	
	
	static void method2 (String  ... values) {
		System.out.println(values.length);
		System.out.println("==========Array.toString(========= ");
		System.out.println(Arrays.toString(values));
		System.out.println();
		System.out.println("============ for ============");
		for (int i = 0 ; i < values.length ; i ++ ) {
			System.out.println( values[i] + " " );
		}
		System.out.println();
		System.out.println("================ enhanced for ==========");
		for ( String k : values) {
			
			System.out.println(k + " ");
		}
		System.out.println();
	}
	
	
	/*
	
	static void method1 () {
		System.out.print("�Ű������� ���� �޼ҵ� ȣ��");
	}
	static void method1 (int a , int b ) {
		System.out.print(a + " , " + b);	
	}
	
	static void method1 (int a , int b, int c ) {
		System.out.print(a + " , " + b + " , " + c);	
	}
		
	static void method1 (int a , int b, int c , int d ) {
		System.out.print(a + " , " + b + " , " + c + " , " + d );	
	}
	static void method1 (int a , int b, int c , int d, int e ) {
		System.out.print(a + " , " + b + " , " + c + " , " + d + " , " + e );	
	}
	*/
	
	
	
}