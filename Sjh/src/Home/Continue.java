package Home;

public class Continue {
	public static void main(String[] args) {
		
		System.out.println("==============Ȧ���� ���=================");

		
		for (int i = 1 ; i < 20 ; i++ ) {
			for ( int j = 1 ; j < 10 ; j++ ) {
				if ( i%2 == 0 ) {
					continue ;
				}
				System.out.println( i + " * " + j + " = "  + (i * j));

			}
			System.out.println("=============================");

			
		}
		
		System.out.println("==============3�� ����� ���=================");

		for (int i = 1 ; i < 20 ; i++ ) {
			for ( int j = 1 ; j < 10 ; j++ ) {
				if ( i%3 > 0) {
					continue ;
				}
				System.out.println( i + " * " + j + " = "  + (i * j));

			}

			System.out.println("===============================");

		}
		
		
		
		
		
	}
}
