package Chap05;

public class Ex03 {

	public static void main(String[] args) {

		 // 벙방형 배열 
		int [][] arr1 = new int [][] { {1,2,3,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,20}};
		
		System.out.println( " ================ 이중 for 문으로 출력 ================");
		
		for ( int i = 0 ; i < arr1.length ; i++) {
			for ( int j = 0 ; j < arr1[i].length ; j++) {
				System.out.print(arr1[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("============= 이중 향상된  for 문을 사용해서 출력 ============");
		
		for (int[] arr : arr1) {
			for ( int k : arr) {
				System.out.print( k + " | ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------");
		}
		
		System.out.println();
		System.out.println();
		
		int [][] arr2 = new int [][] { { 1,2,}, {11,12,13},{21,22,23,24,25},{31,32}};
		
		System.out.println("===============  이중 for  문을 사용해서 출력 ==============");
		
		for ( int i1 = 0 ; i1 < arr2.length ; i1++) {
			for ( int j1 = 0 ;  j1 < arr2[i1].length ; j1++) {
				System.out.print(arr2[i1][j1] + " | ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("==========  이중 향상된 for 문을 사용해서 출력 =========");
		
	
		
		for (int[] _name  : arr2) {
			for ( int k : _name ) {
				System.out.print( k + " | ");
			}
			System.out.println();
			System.out.println("-------------------------------------------------");
		}
		
		
		
		
		
		
	}

}
