package Ex;

public class Ex10 {

	public static void main(String[] args) {

		int[] num = new int [10];
		int sum = 0;
		double avg = 0;			// ����� ��ü�濡�� ( sum )/���� ����
								// ����� ����Ҷ��� �ݵ�� double ������ ����
		
		System.out.println("������ ������ : " );
		
		//�迭�� �� �濡 ������ ���� �߻����Ѽ� �Է� : ������ �� 1 ~ 10
		for (int i = 0 ; i < num.length ; i++) {
			num[i] = (int)(Math.random() * 10 + 1);
			System.out.print( num[i] + " ");	
			
			
		}
		System.out.println();
		
		// ��հ� ���ϱ� : �迭�� �� ���� ������ ���� ���ؼ� ��ü ���� ������ ���´�.
		
		for ( int i = 0 ; i < num.length ; i++) {
			sum += num[i];   //sum = sum + num[i];
		}
		
		avg = (double) sum / num.length;
		System.out.println("����� : " + avg);
		System.out.println("���� : " + sum);
		System.out.println( "���� ������ : " + num.length);
			
			
		}
		

	
}
