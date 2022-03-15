package Ex;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		//양의정수10개를입력하시오>> 1 5 99 22 345 125 2346 55 32 853의배수는99 345 2346
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr1 = new int [10];
		
		
		System.out.println("양의 정수 10개를 입력 하세요.");
	
		for ( int i = 0 ; i < arr1.length ; i++) {
			arr1[i] = sc.nextInt();
			
			
			
		}
		System.out.println("3의 배수는 : ");
		// 3의 배수만 출력
		for ( int i = 0 ; i < arr1.length ; i++ ) {
			if ( arr1[i] %3 == 0 ) {
				System.out.print(arr1[i] + " , ");
			}
		}
		
		
	}

}
