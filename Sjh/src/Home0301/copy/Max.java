package Home0301.copy;

public class Max {

	public static void main(String[] args) {
		
		
		System.out.println( "=========== �ִ� �� ============");
		
		
		int max = 0;
		int[] array = {4,5,1,2,3};
	
		//�ۼ���ġ
		for ( int i = 0 ; i < array.length ; i++ ) {
			if (max < array[i])
			max = array[i];
		//	System.out.println(max);					
		}
		
		System.out.println("max: " + max);
	
	}

}
