package Ex;

public class Ex06 {

	public static void main(String[] args) {

		int[] array = {4,5,1,2,3};
		int max = 0 ;
		
		for ( int i = 0 ; i < array.length; i++) {  	//각방
			if ( array[i] > max) {				// 방의 값이 max 변수의 값보다 클때
				max = array[i];					// max 변수에 큰값을 저장
			}
		}
		
		System.out.println("최대 값은 : " + max);
		
		
	}

}
