package chp05;

public class RactangleValueAssignment_Ex07 {

	public static void main(String[] args) {
		
		System.out.println("=========1==========");
		// 1. �迭 ��ü�� ���� �� ���Ұ� ���� (���1), �迭�� �ʱⰪ�� �� �� ���� ���
		// ������ �迭 // ���簢���� ���, ������ ���� ���� ������ ����

		int[][] array1 = new int [2][3];
		array1 [0][0] = 1;
		array1 [0][1] = 2;
		array1 [0][2] = 3;
		array1 [1][0] = 4;
		array1 [1][1] = 5;
		array1 [1][2] = 6;

		System.out.print(array1[0][0]+"|");
		System.out.print(array1[0][1]+"|");
		System.out.println(array1[0][2]);
		System.out.println("�ѤѤѤ�");
		System.out.print(array1[1][0]+"|");
		System.out.print(array1[1][1]+"|");
		System.out.print(array1[1][2]);
		
		System.out.println();
		System.out.println("=========2==========");
	
		// 1. �迭 ��ü�� ���� �� ���Ұ� ���� (���2)
		
		int[][] array2;
		array2 = new int [2][3];			///ũ�⸦ ���߿� ����
		array2 [0][0] = 1;
		array2 [0][1] = 2;
		array2 [0][2] = 3;
		array2 [1][0] = 4;
		array2 [1][1] = 5;
		array2 [1][2] = 6;

		System.out.print(array2[0][0]+"|");
		System.out.print(array2[0][1]+"|");
		System.out.println(array2[0][2]);
		System.out.println("�ѤѤѤ�");
		System.out.print(array2[1][0]+"|");
		System.out.print(array2[1][1]+"|");
		System.out.print(array2[1][2]);
		
		System.out.println();
		System.out.println("=========3==========");
		
		
		//3. �迭 ��ü�� ���� �� ���Ұ� ����(���2) 	: �ʱⰪ�� �� �� ���
 		int[][] array3 = new int [][] {{1,2,3},{4,5,6}};			//�迭���� ����� ���ÿ� ���Ҵ�.
		
		System.out.print(array3[0][0]+"|");
		System.out.print(array3[0][1]+"|");
		System.out.println(array3[0][2]);
		System.out.println("�ѤѤѤ�");
		System.out.print(array3[1][0]+"|");
		System.out.print(array3[1][1]+"|");
		System.out.print(array3[1][2]);
		
		System.out.println();
		System.out.println("=========4==========");
		
		
		
		//4. �迭 ��ü�� ���� �� ���Ұ� ����(���2) 	: �ʱⰪ�� �� �� ���
 		int[][] array4;
 		array4 = new int [][] {{1,2,3},{4,5,6}};			//�迭���� ����� ���ÿ� ���Ҵ�.
		
		System.out.print(array4[0][0]+"|");
		System.out.print(array4[0][1]+"|");
		System.out.println(array4[0][2]);
		System.out.println("�ѤѤѤ�");
		System.out.print(array4[1][0]+"|");
		System.out.print(array4[1][1]+"|");
		System.out.print(array4[1][2]);
		
		System.out.println();
		System.out.println("==========5=========");
		
		
		//4. �迭 ��ü�� ���� �� ���Ұ� ���� (���3) : 
		
		int[][] array5 =  {{1,2,3},{4,5,6}};			//�迭���� ����� ���ÿ� ���Ҵ�.
		
		System.out.print(array5[0][0]+"|");
		System.out.print(array5[0][1]+"|");
		System.out.println(array5[0][2]);
		System.out.println("�ѤѤѤ�");
		System.out.print(array5[1][0]+"|");
		System.out.print(array5[1][1]+"|");
		System.out.print(array5[1][2]);
		
		System.out.println();
		System.out.println("==========6=========");
		
		
	/*	int[][] array6;
		array6 = {{1,2,3},{4,5,6}};			//new int �����Ұ���
		
		System.out.print(array5[0][0]+"|");
		System.out.print(array5[0][1]+"|");
		System.out.println(array5[0][2]);
		System.out.println("�ѤѤѤ�");
		System.out.print(array5[1][0]+"|");
		System.out.print(array5[1][1]+"|");
		System.out.print(array5[1][2]);
		
		System.out.println();
		System.out.println("==========6=========");  
		
		*/
		
		
		
		
		
	}

}
