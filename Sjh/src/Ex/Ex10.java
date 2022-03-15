package Ex;

public class Ex10 {

	public static void main(String[] args) {

		int[] num = new int [10];
		int sum = 0;
		double avg = 0;			// 평균을 전체방에서 ( sum )/방의 갯수
								// 평균을 계산할때는 반드시 double 형으로 지정
		
		System.out.println("랜덤한 정수들 : " );
		
		//배열의 각 방에 임의의 수를 발생시켜서 입력 : 임의의 수 1 ~ 10
		for (int i = 0 ; i < num.length ; i++) {
			num[i] = (int)(Math.random() * 10 + 1);
			System.out.print( num[i] + " ");	
			
			
		}
		System.out.println();
		
		// 평균값 구하기 : 배열의 각 방의 랜덤한 값을 더해서 전체 방의 갯수로 나는다.
		
		for ( int i = 0 ; i < num.length ; i++) {
			sum += num[i];   //sum = sum + num[i];
		}
		
		avg = (double) sum / num.length;
		System.out.println("평균은 : " + avg);
		System.out.println("합은 : " + sum);
		System.out.println( "방의 갯수는 : " + num.length);
			
			
		}
		

	
}
