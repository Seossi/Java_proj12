package chp05;

public class RactangleValueAssignment_Ex07 {

	public static void main(String[] args) {
		
		System.out.println("=========1==========");
		// 1. 배열 객체의 생성 및 원소값 대입 (방법1), 배열의 초기값을 알 수 없는 경우
		// 정방형 배열 // 직사각으로 출력, 각각의 행의 열의 갯수가 같다

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
		System.out.println("ㅡㅡㅡㅡ");
		System.out.print(array1[1][0]+"|");
		System.out.print(array1[1][1]+"|");
		System.out.print(array1[1][2]);
		
		System.out.println();
		System.out.println("=========2==========");
	
		// 1. 배열 객체의 생성 및 원소값 대입 (방법2)
		
		int[][] array2;
		array2 = new int [2][3];			///크기를 난중에 설정
		array2 [0][0] = 1;
		array2 [0][1] = 2;
		array2 [0][2] = 3;
		array2 [1][0] = 4;
		array2 [1][1] = 5;
		array2 [1][2] = 6;

		System.out.print(array2[0][0]+"|");
		System.out.print(array2[0][1]+"|");
		System.out.println(array2[0][2]);
		System.out.println("ㅡㅡㅡㅡ");
		System.out.print(array2[1][0]+"|");
		System.out.print(array2[1][1]+"|");
		System.out.print(array2[1][2]);
		
		System.out.println();
		System.out.println("=========3==========");
		
		
		//3. 배열 객체의 생성 및 원소값 대입(방법2) 	: 초기값을 알 때 사용
 		int[][] array3 = new int [][] {{1,2,3},{4,5,6}};			//배열변수 선언과 동시에 값할당.
		
		System.out.print(array3[0][0]+"|");
		System.out.print(array3[0][1]+"|");
		System.out.println(array3[0][2]);
		System.out.println("ㅡㅡㅡㅡ");
		System.out.print(array3[1][0]+"|");
		System.out.print(array3[1][1]+"|");
		System.out.print(array3[1][2]);
		
		System.out.println();
		System.out.println("=========4==========");
		
		
		
		//4. 배열 객체의 생성 및 원소값 대입(방법2) 	: 초기값을 알 때 사용
 		int[][] array4;
 		array4 = new int [][] {{1,2,3},{4,5,6}};			//배열변수 선언과 동시에 값할당.
		
		System.out.print(array4[0][0]+"|");
		System.out.print(array4[0][1]+"|");
		System.out.println(array4[0][2]);
		System.out.println("ㅡㅡㅡㅡ");
		System.out.print(array4[1][0]+"|");
		System.out.print(array4[1][1]+"|");
		System.out.print(array4[1][2]);
		
		System.out.println();
		System.out.println("==========5=========");
		
		
		//4. 배열 객체의 생성 및 원소값 대입 (방법3) : 
		
		int[][] array5 =  {{1,2,3},{4,5,6}};			//배열변수 선언과 동시에 값할당.
		
		System.out.print(array5[0][0]+"|");
		System.out.print(array5[0][1]+"|");
		System.out.println(array5[0][2]);
		System.out.println("ㅡㅡㅡㅡ");
		System.out.print(array5[1][0]+"|");
		System.out.print(array5[1][1]+"|");
		System.out.print(array5[1][2]);
		
		System.out.println();
		System.out.println("==========6=========");
		
		
	/*	int[][] array6;
		array6 = {{1,2,3},{4,5,6}};			//new int 생략불가능
		
		System.out.print(array5[0][0]+"|");
		System.out.print(array5[0][1]+"|");
		System.out.println(array5[0][2]);
		System.out.println("ㅡㅡㅡㅡ");
		System.out.print(array5[1][0]+"|");
		System.out.print(array5[1][1]+"|");
		System.out.print(array5[1][2]);
		
		System.out.println();
		System.out.println("==========6=========");  
		
		*/
		
		
		
		
		
	}

}
