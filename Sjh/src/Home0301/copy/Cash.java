package Home0301.copy;

import java.util.Scanner;

public class Cash {

	public static void main(String[] args) {

		System.out.println("========= �ݾ� �з� ========");
		System.out.println();
		
		System.out.println( "�ݾ��� �Է��ϼ���!");
		Scanner sc = new Scanner( System.in );
		
		int money = 0;
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		money = sc.nextInt();
		
			for ( int  i =  0 ; i < unit.length ; i++ ) {
		
			if ( money / unit[i] > 0) {
			
			System.out.println(unit[i] + "�� : "  +  money/unit[i] + " ��");
			money %= unit[i];
	
			
		}
		
	}
	
		
		
		
	}

}
