package Home;

import java.util.Arrays;

public class Arr2 {
	public static void main(String[] args) {
		
		// 배열변수명 : arr1 [100]
		int[] arr1 = new int [100];
		int j = 0;
		
		
		for ( int i = 0 ; i < arr1.length ; i++) {
			System.out.print((arr1[i])+ j++ +" ");
		}
		
		
		System.out.println();
		System.out.println("==========향상된 array=========");
		
		for ( int k : arr1) {			
			System.out.print( k + j++ + " " ); 
			
		}
		
		
		System.out.println();
		System.out.println("==========향상된 array.toString()=========");
		
		
		
		for ( int  l = 0 ; l < 100 ; l++) {
			
	//		System.out.println(Arrays.toString[l]);
		}
		
		//0방 : 0
		
		//1방 : 2
		// ~
		//99방 : 100
		
		//for문을 사용해서 저장
		//출력을 for 문 을 사용해서 출력 arrays.toString()
 		
		
		
		
		
		
		
		
		
	}
		
}
