package Ex03.copy;

class Car {
	String company;		// �ʵ�(�ν��Ͻ� �ʵ�)�� company �� �˷��ִ� this
	String model;		// �ν��Ͻ� : ��üȭ�� ������ ��� ������ �ʵ�.
	String color;		// [�ʵ�� : �ʵ��� ��]�� Heap ������ ���� 
	double maxSpeed;
	
	Car () {} // �⺻ ������
	
	Car (String company, String model, String color, double max){
	
	this.company = company;		// this Ű�� ��ü�� �ʵ��� ������ ����
	this.model = model;			// 3���� ���� ��ΰ� ������ ��� ��ü�� �ʵ��� ������ �˷��ִ� ��Ȱ
	this.color = color;
	maxSpeed = max;		// this  Ű���尡 ������ ����
	
	}									// �ν��Ͻ��� ��üȭ ���Ѿ� ��밡��!!!!!!
	void work() {				// �޼ҵ�  (�ν��Ͻ� �޼ҵ�) : Heap ������ �޼ҵ��� �����͸� ����
		System.out.print(company);	// �޼ҵ��� ��ü ������ Ŭ���� ������ �޼ҵ� ������ ����
		System.out.print(model);
		System.out.print(color);
		System.out.print(maxSpeed);
	}
}


public class Q1 {

	public static void main(String[] args) {
		// �ļ��ڸ� ���ؼ� �⺻���� �϶��� �� �޸��� ������ work() �޼ҵ带 ����ؼ� ���.
		
		
		Car car1 = new Car ("����", "�ҳ�Ÿ", "����", 220.0);
		car1.work();
		
		

	}

}
