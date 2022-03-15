package Ex;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		
		/*
		 * String str[] = {"가위", "바위", "보"};컴퓨터가내는것을랜덤하게선택하기위해서는다음코드를이용한다.
		 * int n = (int)(Math.random()*3); // n은0, 1, 2 중에서랜덤하게결정컴퓨터가낸것이"바위" 인지비교하는코드는다음과같이한다.
		 * if(str[n].equals("바위")) //컴퓨터가낸것이"바위"인지비교하는문
		 */
		
		Scanner sc = new Scanner(System.in);
		String str[] = {"가위", "바위", "보"};
		String uSelect, comSelect; // 입력값, 컴퓨터 값
		
		int n ; //0.00000xxx~ 0.9999xx  (int 정수) 출력은 : 0,1,2 
	
		System.out.println("프로그램을 종료 하려면 \"그만\"을 입력하세요");
		
		do {
			System.out.println("당신이 낸값 : ");
			uSelect = sc.next();			//당신이 내는 값 : 인풋
			if (uSelect.equals("그만")) { break;}
			
			n = (int)(Math.random() *3); // 컴퓨터가 낸값
			comSelect = str[n];    //
	    	
			
			//사용자가 가위일때 
			if ( uSelect.equals("가위")) {
				if (comSelect.equals("가위")) {
					System.out.println("사용자 = " + uSelect + ",  컴퓨터 = " + comSelect + " 비겻습니다.");
				} else if ( comSelect.equals("바위"))  {
					System.out.println("사용자 = " + uSelect + ",  컴퓨터 = " + comSelect + " 졋습니다.");
				} else if (comSelect.equals("보")){
					System.out.println("사용자 = " + uSelect + ",  컴퓨터 = " + comSelect + " 비겻습니다.");
				}
				
			
			//사용자가 가위일때
		        }else if ( uSelect.equals("바위")) {
		        	if (comSelect.equals("가위"))  {
					System.out.println("사용자 = " + uSelect + ",  컴퓨터 = " + comSelect + " 이겻습니다.");
				}else if ( comSelect.equals("바위"))  {
					System.out.println("사용자 = " + uSelect + ",  컴퓨터 = " + comSelect + " 비겻습니다.");
				}else if (comSelect.equals("보")){
					System.out.println("사용자 = " + uSelect + ",  컴퓨터 = " + comSelect + " 졋습니다.");
				}
				
				
			
			//사용자가 보일때
			}else if (uSelect.equals("보")) {
				if ( comSelect.equals("가위")) {
					System.out.println("사용자 = " + uSelect + ",  컴퓨터 = " + comSelect + " 졋습니다.");
				
			    } else if ( comSelect.equals("바위")) {
				System.out.println("사용자 = " + uSelect + ",  컴퓨터 = " + comSelect + " 졋습니다.");
			
			    } else if ( comSelect.equals("가위")) {
				System.out.println("사용자 = " + uSelect + ",  컴퓨터 = " + comSelect + " 졋습니다.");
						
			    }
			}
			
			}while (true);
			
			sc.close();
			System.out.println("프로그램을 종료 합니다. ");
		}
}				
		
