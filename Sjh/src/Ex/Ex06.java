package Ex;

public class Ex06 {

	public static void main(String[] args) {

		int[] array = {4,5,1,2,3};
		int max = 0 ;
		
		for ( int i = 0 ; i < array.length; i++) {  	//����
			if ( array[i] > max) {				// ���� ���� max ������ ������ Ŭ��
				max = array[i];					// max ������ ū���� ����
			}
		}
		
		System.out.println("�ִ� ���� : " + max);
		
		
	}

}
