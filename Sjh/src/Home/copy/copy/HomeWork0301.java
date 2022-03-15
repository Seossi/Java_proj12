package Home.copy.copy;

import java.util.Scanner;

public class HomeWork0301 {

	public static void main(String[] args) {
	
		//1~100 까지 합
		
		System.out.println("============== 1~100 ==============");
		
		int sum = 0;
		int i = 0;
		
		for ( i = 0; i <= 100 ; i++) {
			sum += i;
			System.out.println("1부터 " + i + "의 합" + sum);
			
		}
		System.out.println("=============== 삼각형 =============");
		
		// for 문을 이용해서 실행 결과와 같은 삼각형
		
		for ( int si = 0 ; si <= 4 ; si++) {
			for ( int sj = 0 ; sj < si ; sj++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	
    
           
		
		
		

	}

}
