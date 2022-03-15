package Home;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {

		//배열 변수명  arr2
		System.out.println();
		System.out.println("=======for 문 전체 출력=======");
		
		
		int[] arr2 = new int[300];
		
		for (int i = 0 ; i < arr2.length ; i++) {
			arr2[i] = i + 1;  // arr2[i] = (i + 1)*3;
			System.out.println(i + " 번째 방 : " + arr2[i]);
		}
			
		
		
		
		//Enhanced for 문
	
		System.out.println();
		System.out.println("=======Enhanced for=======");
		
		
		int j = 1;
		for (int i = 100 ; i <= arr2.length ; i++ ) {
			if ( i % 3 == 0) {
				System.out.println(j++ + "번째 방 : "  + i);
			}
				
		}
	
		
		
		//toString
		System.out.println();
		System.out.println("=======Arrays.toString=======");
		
		
		System.out.println(Arrays.toString(arr2));
		
		
	
		
		
	}

}
