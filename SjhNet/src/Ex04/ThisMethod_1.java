package chap06_07.Ex04;



/* 1. this Ű����� ���Ǵ� ��� : this.m ( �ʵ��� m ) this.init() (�ڽŰ�ü�� �޼ҵ� init())
 * 
 * 2. this �� �޼ҵ�� ���Ǵ� ��� : 
 * 	  this(); <== ������ ������ ������ �ִ� �ٸ� �����ڸ� ȣ���Ҷ� ����Ѵ�.
 *  				<==	�ݵ�� ������ ������ ù �ٿ� �;��Ѵ�. 
 *  				<== �޼ҵ� ���ο����� ����� �� ����. (������ ���ο����� ��밡��)
 */	

class Abc {
	Abc() {		// �������� �Ű����� ���� ���� ������ 
		System.out.println("ù��° ������ �Դϴ�.");
	}
	Abc(int a) {
		this();						//�Ű������� ���� �⺻������ ȣ��, this(); �������� ù ���ο� �;� ��.
		System.out.println(" �ι�° ������ �Դϴ�.");
	}

	/* void abc() {			// �޼��� ���ο����� ��� �Ұ���, ������ ���ο��� ��� ���� ( ù ���ο� ��ġ �ؾ��Ѵ�.)
		this(); 	//this(); <==  �޼��� �������� this();�� ����� �� ����.
					//this(); <== �ٸ� �����ڸ� ȣ�� �� �� ���.
	}
	*/
	
	Abc(int a , String b  ) {
		this (30);					// this( 30 ) : �Ű������� ���� 1�� ���� ������ ȣ�� 
		System.out.println("����° ������ �Դϴ�.");
		
		
	}
	
	
	
	
}


public class ThisMethod_1 {

	public static void main(String[] args) {
		//1. ��ü ���� 
		Abc abc = new Abc(); 	//�Ű� ������ ���� ������ ȣ��
		
		System.out.println("=======================");
		
		Abc abc1 = new Abc(10);		// �Ű� ������ ���� 1���� �����ڸ� ȣ�� , 
		
		System.out.println("=======================");
		
		Abc abc2 = new Abc ( 10, "�ȳ��ϼ���!");
		
		
		
	}

}