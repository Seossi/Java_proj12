package Home.copy.copy;

import java.util.Scanner;

public class Home_Scan {
	public static void main(String[] args) {
		//양의 정수를 10 개 입력,
		
		System.out.println("=========== 양의 정수 10개입력 후 3의 배수 추출 ===========");
		
		
		
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
     		   System.out.print("3의 배수 : " + num[i10]);
        }
	} 
}


