package chp04;

public class DoWhile_Ex05 {

	public static void main(String[] args) {

		// 1. While 문과 Do While  문의 비교 : 실행이 0인 경우
		
		System.out.println();
		System.out.println("==========반복 횟수가 0인경우==========");
		
		int a = 0 ;
		while (a < 0 ) { 			// 조건이 true 일때 실행
			System.out.print(a+" ");
			a++;
		}

		
		System.out.println();
				
		a = 0;
		do {
			System.out.print(a + " ");    //do while 문에서 무조건 1회 실행
			a++;
		
		} while (a < 0);   // 조건이  false // 조건이 true 일 동안 실행 
		
		
		System.out.println();
		System.out.println("==========반복횟수가 1인경우==========");
				
		
		//2. 반복 횟수가 1인 경우
		
		a = 0;
		while ( a < 1 ) {
			System.out.print( a + " ");
			a++;
		}
		
		
		
		System.out.println();
				
		
		a = 0;
		
		do {
			System.out.print( a + " " );
			a++;
			
		} while ( a > 1);
		
		System.out.println();
		System.out.println("==========10회 반복==========");
		
		// 반복 횟수가 10번인 경우
		
		a = 0;
		while (a < 10)	{
			System.out.print(a + " ");
			a++;
			
		}
		System.out.println();
		
		a = 0;
		do { 
			System.out.print( a+" ");
			a++;
		} while ( a < 10);
		
		
		
		
		
		
		
		
		
		
	}

}
