package Home0301.copy;

import java.util.Scanner;

public class HomeWork0301 {

	public static void main(String[] args) {
	
		System.out.println("=============== 10까지 랜던생성 + 평균 =============");

		
		/* 정수를 10 개 저장하는 배열을 만들고 1 에서 10 까지 범위의 정수를 랜
		 덤하게 생성하여 배열에 저장하라. 그리고 배열에 든 숫자들과 평균을 출력하라.
		 */
		
		System.out.print("| 랜던한 정수 : ");

		
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
		System.out.println("| 평균 : " + sum + " |");
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
