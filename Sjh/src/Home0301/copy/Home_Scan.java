package Home0301.copy;

import java.util.Scanner;

public class Home_Scan {

	public static void main(String[] args) {
		
		System.out.println("========= 10 �Է� 3��� ��� =============");

		//���� ������ 10 �� �Է�,
		
		   System.out.print("�ϳ� : " + "�� : " +"�� : " +"�� : " +"�� : " +"���� : " +"ĥ : " +"�� : " +"��ȩ : " +"�� : ");

		   
		   int[] num = new int[10];
        int in = num.length;
        
        Scanner  Scanner = new Scanner(System.in);
        
        for ( int  i10 = 0 ; i10 < in ; i10++) {
 		   num[i10] = Scanner.nextInt();
        }
        
        //  3�� ����� ���.
        
        for ( int i10 = 0; i10 < in ; i10++) {
     	   if ( num[i10] %3 == 0)
     		   System.out.print("3�� ��� : " + num[i10]);
     	  
        }
        Scanner.close();
	} 
}


