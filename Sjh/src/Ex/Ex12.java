package Ex;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		/*
		 * [����11]�����ڵ�Ͱ��̰����������¦���̷絵��2���ǹ迭���ۼ��϶�.
		 * String course[] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		 * int score[]  = {95, 88, 76, 62, 55};
		 * �׸���������ÿͰ��̰����̸����Է¹޾�����������ϴ����α׷����ۼ��϶�. "�׸�"���Է¹����������Ѵ�. 
		 * (Java���ε���0�������Ƿ�score[0]�����)�����̸�>> Jaba���°����Դϴ�.
		 * �����̸�>> JavaJava��������95
		 * �����̸�>> �ȵ���̵�ȵ���̵���������55
		 * �����̸�>> �׸�[Hint]���ڿ������ϱ����ؼ���
		 * String Ŭ������equals()�޼ҵ带�̿��ؾ��Ѵ�.
		 * 
		 * String name;
		 * if(course[i].equals(name)) {
		 * int n = score[i];
		 * ...
		 * }
		 
		
		
		// String �� ���� �Ҵ��ϴ� 2���� ���
		
		// �����ڸ�  ���ؼ� �Ҵ�. // ������ �޸� �Ҵ�.
		String aa = new String("�ȳ�");
		String bb = new String("�ȳ�");
		System.out.println(aa);				// �⺻ �ڷ����϶� : == (���� ��)
		System.out.println(bb);				// ���� �ڷ����� : == ��(�������� �ƴ�) "�ּ�"�� ��
											// ���� �ڷ����϶� ���� �� : str1.equals(str2) <== �������� str1 ���� str2�� �Ѱž� �ִ� ���� ��.
											// String �� ���� �Ҵ��Ҷ� �����ڸ� ���ؼ� �Ҵ�.
		if ( aa == bb) { 					// �޸��� �ּ� ���� �� ( aa, bb �� �ٸ� �޸� �ּҸ� ���´�. 
			System.out.println(true);
		} else {
			System.out.println(false);		// false ���� ����Ű�� �ּҰ��� �ٸ���.
		}
		
		System.out.println("==================================");
		
		if (aa.equals(bb)) {				//�޸��� ���� ���Ҷ� aa.equals.bb	
			System.out.println(true);		//true�� ��� ( ���� �� )
		} else {
			System.out.println(false);
		}
		
		
		
		String a = "�ȳ�";
		String b = "�ȳ�";
		
		if ( a == b) { 					// ���� �ڷ������� "==" : �޸��� 
			System.out.println(true);
		} else {
			System.out.println(false);
		}
				
		*/
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		String[] course = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int[] score = { 95, 88, 76, 62, 55 };
		
		String name = null; // ��ĳ�ʷ� ������ ���ڿ��� �޴� ����
		int i = 0 ;     // �ݹ�ȣ�� ��� ����
		
		while ( true) { // Ư�� ������ �����Ҷ� ���� ��� ���� ���ư�.
			System.out.println("�����̸�  : ");
			name = sc.next();    // ��ĳ�ʷ� �����̸��� �޾Ƽ� ���� name �� �Ҵ�.
			
			if ( name.equals("�׸�"))
				
		
	}
	
	
	
	
	
}
