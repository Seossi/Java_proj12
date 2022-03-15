package Ex;

public class Ex04 {

	public static void main(String[] args) {
		
		int lineCount; //다음 라인으로 행을 바꾸는 변수
		int starCount; // 별을 출력하는 변수	
		
		for ( lineCount = 0 ; lineCount < 4 ; lineCount++ ) {
			for (starCount = 0 ; starCount <= lineCount ; starCount++) {
				System.out.print("*");
								
			}
			System.out.println();
		}
		
		
		
	}

}
