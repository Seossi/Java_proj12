package Ex;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		//[����8]�迭���ݺ������̿��Ͽ����α׷����ۼ��غ���. Ű���忡�������εȵ��Ǿ׼����Է¹޾ƿ�������, ������, õ����, 500��¥������, 100��¥������, 50��¥������, 10��¥������, 1��¥�������̰���κ�ȯ�Ǵ������ÿͰ�������϶�. �̶��ݵ�ô����迭���̿��ϰ�ݺ��������ۼ��϶�.
		
		//50000 ��¥��: 1��10000 ��¥��: 1��1000 ��¥��: 5��500 ��¥��: 0��100 ��¥��: 1��50 ��¥��: 0��10 ��¥��: 2��1 ��¥��: 3��
		
		
		
		Scanner sc = new Scanner(System.in);
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // ȯ���� ���� ������ �迭�� ����
		int money;
		
		System.out.println("ȯ���� ���� �ݾ��� �Է� �ϼ���.");
		money = sc.nextInt();
		
		for  ( int i = 0 ; i < unit.length ; i++) {
			System.out.printf(" %d �� ¥�� : %d �� \n " , unit[i], money/unit[i]);
			//System.out.println(unit[i] + "  �� ¥�� : " + money / unit [i]); 
			money = money - ( money / unit[i] ) * unit[i]; // ȯ���� ���� ����(-1) * 50000��
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
