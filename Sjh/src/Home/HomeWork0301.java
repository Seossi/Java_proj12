package Home;

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
		
		
		
		System.out.println("========= 10 입력 3배수 출력 =============");

		//양의 정수를 10 개 입력,
		
		   System.out.print("하나 : " + "둘 : " +"삼 : " +"넷 : " +"오 : " +"여섯 : " +"칠 : " +"팔 : " +"아홉 : " +"열 : ");

		   
		   int[] num = new int[10];
           int in = num.length;
           
           Scanner  Scanner = new Scanner(System.in);
           
           for ( int  i10 = 0 ; i10 < in ; i10++) {
    		   num[i10] = Scanner.nextInt();
           }
           
           //  3의 배수만 출력.
           
           for ( int i10 = 0; i10 < in ; i10++) {
        	   if ( num[i10] %3 == 0)
        		   System.out.println("3의 배수 : " + num[i10]);
           }
           
    
           
		
		
		

	}

}
