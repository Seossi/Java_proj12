package Home;

import java.util.Scanner;

public class HomeWork0301 {

	public static void main(String[] args) {
	
		//1~100 ���� ��
		
		System.out.println("============== 1~100 ==============");
		
		int sum = 0;
		int i = 0;
		
		for ( i = 0; i <= 100 ; i++) {
			sum += i;
			System.out.println("1���� " + i + "�� ��" + sum);
			
		}
		System.out.println("=============== �ﰢ�� =============");
		
		// for ���� �̿��ؼ� ���� ����� ���� �ﰢ��
		
		for ( int si = 0 ; si <= 4 ; si++) {
			for ( int sj = 0 ; sj < si ; sj++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println("========= 10 �Է� 3��� ��� =============");

		//���� ������ 10 �� �Է�,
		
		   System.out.print("�ϳ� : " + "�� : " +"�� : " +"�� : " +"�� : " +"���� : " +"ĥ : " +"�� : " +"��ȩ : " +"�� : ");

		   
		   int[] num = new int[10];
           int in = num.length;
           
           Scanner  Scanner = new Scanner(System.in);
           
           for ( int  i10 = 0 ; i10 < in ; i10++) {
    		   num[i10] = Scanner.nextInt();
           }
           
           //  3�� ����� ���.
           
           for ( int i10 = 0; i10 < in ; i10++) {
        	   if ( num[i10] %3 == 0)
        		   System.out.println("3�� ��� : " + num[i10]);
           }
           
    
           
		
		
		

	}

}
