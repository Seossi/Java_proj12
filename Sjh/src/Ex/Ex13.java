package Ex;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		
		/*
		 * String str[] = {"����", "����", "��"};��ǻ�Ͱ����°��������ϰԼ����ϱ����ؼ��´����ڵ带�̿��Ѵ�.
		 * int n = (int)(Math.random()*3); // n��0, 1, 2 �߿��������ϰ԰�����ǻ�Ͱ�������"����" �������ϴ��ڵ�´����������Ѵ�.
		 * if(str[n].equals("����")) //��ǻ�Ͱ�������"����"�������ϴ¹�
		 */
		
		Scanner sc = new Scanner(System.in);
		String str[] = {"����", "����", "��"};
		String uSelect, comSelect; // �Է°�, ��ǻ�� ��
		
		int n ; //0.00000xxx~ 0.9999xx  (int ����) ����� : 0,1,2 
	
		System.out.println("���α׷��� ���� �Ϸ��� \"�׸�\"�� �Է��ϼ���");
		
		do {
			System.out.println("����� ���� : ");
			uSelect = sc.next();			//����� ���� �� : ��ǲ
			if (uSelect.equals("�׸�")) { break;}
			
			n = (int)(Math.random() *3); // ��ǻ�Ͱ� ����
			comSelect = str[n];    //
	    	
			
			//����ڰ� �����϶� 
			if ( uSelect.equals("����")) {
				if (comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + ",  ��ǻ�� = " + comSelect + " �����ϴ�.");
				} else if ( comSelect.equals("����"))  {
					System.out.println("����� = " + uSelect + ",  ��ǻ�� = " + comSelect + " �����ϴ�.");
				} else if (comSelect.equals("��")){
					System.out.println("����� = " + uSelect + ",  ��ǻ�� = " + comSelect + " �����ϴ�.");
				}
				
			
			//����ڰ� �����϶�
		        }else if ( uSelect.equals("����")) {
		        	if (comSelect.equals("����"))  {
					System.out.println("����� = " + uSelect + ",  ��ǻ�� = " + comSelect + " �̰���ϴ�.");
				}else if ( comSelect.equals("����"))  {
					System.out.println("����� = " + uSelect + ",  ��ǻ�� = " + comSelect + " �����ϴ�.");
				}else if (comSelect.equals("��")){
					System.out.println("����� = " + uSelect + ",  ��ǻ�� = " + comSelect + " �����ϴ�.");
				}
				
				
			
			//����ڰ� ���϶�
			}else if (uSelect.equals("��")) {
				if ( comSelect.equals("����")) {
					System.out.println("����� = " + uSelect + ",  ��ǻ�� = " + comSelect + " �����ϴ�.");
				
			    } else if ( comSelect.equals("����")) {
				System.out.println("����� = " + uSelect + ",  ��ǻ�� = " + comSelect + " �����ϴ�.");
			
			    } else if ( comSelect.equals("����")) {
				System.out.println("����� = " + uSelect + ",  ��ǻ�� = " + comSelect + " �����ϴ�.");
						
			    }
			}
			
			}while (true);
			
			sc.close();
			System.out.println("���α׷��� ���� �մϴ�. ");
		}
}				
		
