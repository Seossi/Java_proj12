package Ex;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		//[문항8]배열과반복문을이용하여프로그램을작성해보자. 키보드에서정수로된돈의액수를입력받아오만원권, 만원권, 천원권, 500원짜리동전, 100원짜리동전, 50원짜리동전, 10원짜리동전, 1원짜리동전이각몇개로변환되는지예시와같이출력하라. 이때반드시다음배열을이용하고반복문으로작성하라.
		
		//50000 원짜리: 1개10000 원짜리: 1개1000 원짜리: 5개500 원짜리: 0개100 원짜리: 1개50 원짜리: 0개10 원짜리: 2개1 원짜리: 3개
		
		
		
		Scanner sc = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류를 배열에 저장
		int money;
		
		System.out.println("환산할 돈의 금액을 입력 하세요.");
		money = sc.nextInt();
		
		for  ( int i = 0 ; i < unit.length ; i++) {
			System.out.printf(" %d 원 짜리 : %d 개 \n " , unit[i], money/unit[i]);
			//System.out.println(unit[i] + "  원 짜리 : " + money / unit [i]); 
			money = money - ( money / unit[i] ) * unit[i]; // 환산한 돈의 갯수(-1) * 50000원
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
