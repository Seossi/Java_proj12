package Home0301.copy;

public class Max {

	public static void main(String[] args) {
		
		
		System.out.println( "=========== 최대 값 ============");
		
		
		int max = 0;
		int[] array = {4,5,1,2,3};
	
		//작성위치
		for ( int i = 0 ; i < array.length ; i++ ) {
			if (max < array[i])
			max = array[i];
		//	System.out.println(max);					
		}
		
		System.out.println("max: " + max);
	
	}

}
