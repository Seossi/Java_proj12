package Home.copy.copy;

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
		
		
		
	
    
           
		
		
		

	}

}
