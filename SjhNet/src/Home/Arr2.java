package Home;

import java.util.Arrays;

public class Arr2 {
	public static void main(String[] args) {
		
		// �迭������ : arr1 [100]
		int[] arr1 = new int [100];
		int j = 0;
		
		
		for ( int i = 0 ; i < arr1.length ; i++) {
			System.out.print((arr1[i])+ j++ +" ");
		}
		
		
		System.out.println();
		System.out.println("==========���� array=========");
		
		for ( int k : arr1) {			
			System.out.print( k + j++ + " " ); 
			
		}
		
		
		System.out.println();
		System.out.println("==========���� array.toString()=========");
		
		
		
		for ( int  l = 0 ; l < 100 ; l++) {
			
	//		System.out.println(Arrays.toString[l]);
		}
		
		//0�� : 0
		
		//1�� : 2
		// ~
		//99�� : 100
		
		//for���� ����ؼ� ����
		//����� for �� �� ����ؼ� ��� arrays.toString()
 		
		
		
		
		
		
		
		
		
	}
		
}
