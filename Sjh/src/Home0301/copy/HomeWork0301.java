package Home0301.copy;

import java.util.Scanner;

public class HomeWork0301 {

	public static void main(String[] args) {
	
		System.out.println("=============== 10���� �������� + ��� =============");

		
		/* ������ 10 �� �����ϴ� �迭�� ����� 1 ���� 10 ���� ������ ������ ��
		 ���ϰ� �����Ͽ� �迭�� �����϶�. �׸��� �迭�� �� ���ڵ�� ����� ����϶�.
		 */
		
		System.out.print("| ������ ���� : ");

		
		int[] array1 = new int[10]; 
		
		
		for ( int j = 0; j < 10 ; j++ ) {
			  int i = (int)(Math.random()*10+1);
			  array1[j] = i;
			  System.out.print(i + ", ");
		}
		
		
		double sum = 0;
		
		for ( int j = 0; j < 10 ; j++ ) {
			sum += array1[j];
			
		}
		
		sum /= 10;
		System.out.println("| ��� : " + sum + " |");
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
