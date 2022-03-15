package Ex;

public class Ex099 {

	public static void main(String[] args) {


		double c = (double) Math.random();
		
		System.out.println(c);
		
		int d = (int) ( Math.random() * 10);
		int e = (int) (Math.random() * 10 +1);
		
		System.out.println("0~10까지 랜덤한 값 : " + d );
		System.out.println("1부터 10까지의 렌덤한 값 :" + e);			
		
		
	}

}
