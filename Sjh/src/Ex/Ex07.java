package Ex;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		//��������10�����Է��Ͻÿ�>> 1 5 99 22 345 125 2346 55 32 853�ǹ����99 345 2346
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int [10];
		
		
		System.out.println("���� ���� 10���� �Է� �ϼ���.");
	
		for ( int i = 0 ; i < arr1.length ; i++) {
			arr1[i] = sc.nextInt();
			
			
			
		}
		System.out.println("3�� ����� : ");
		// 3�� ����� ���
		for ( int i = 0 ; i < arr1.length ; i++ ) {
			if ( arr1[i] %3 == 0 ) {
				System.out.print(arr1[i] + " , ");
			}
		}
		
		
	}

}
