package Chap06_07.Ex02;

import java.util.Arrays;

public class ArrayArgumentMethod {

	static void printArray(int[] a) {		//static �����鼭 ���� Ŭ������ �����ϴ� �޼ҵ�
		
		//static �����鼭 ���� Ŭ������ �����ϴ� �żҵ� : �޼ҵ� �̸����� ȣ���� ����
		// �ٸ� ��Ű������ ���� �����ϵ��� ���� : ���� ������ (public, protected, default, private)
		//���������ڰ� �����Ǿ� ������ : default (���� ��Ű������ ���ٰ���)
		
	
									
		
		System.out.println("=============Arrays.toString()�� ��� ==================");
		System.out.println(Arrays.toString(a));	
		
		
				
		//for ���� ����ؼ� ���
	System.out.println("============= for ������ ��� ================");
	
		for  ( int i = 0 ; i <a.length ; i++ ) {
			System.out.print(a[i] + " "); 
		}
	
			
		
	//���� for ���� ����ؼ� ���
	System.out.println("=================����  for �� ================");
	
		for ( int k : a) {
			System.out.print( k + " ");
		}
	
	}
	public static void main(String[] args) {
		// �迭�� �Ű� ����ȣ ������ �żҵ� ȣ��
		
		int [] a = new int[] {1,2,3};				//�迭 ������ �����ϰ� ���� ���� �� 
		
		printArray (a);						// �迭������ �޼ҵ� ȣ��� �� ���� �Է�
		
		printArray (new int [] {4,5,6,7,8});	
		// printArray({1,2,3});  // �����߻�
		
			

	}

}
