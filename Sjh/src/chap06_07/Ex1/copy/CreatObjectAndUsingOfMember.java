package chap06_07.Ex1.copy;

// Ŭ����(class) : ���赵, �ؾ Ʋ
// ��ü (object) : Ŭ������ �����ؼ� RAM ���� �۵��Ǵ� �����ڵ� ( ��, �ؾƲ )
		// ��ü == �ν��Ͻ� 
		// �ν��Ͻ�ȭ ( ��üȭ) ��Ų��. (���� �޼ҵ忡�� ��ü�� �ν��Ͻ�ȭ ���� ����Ѵ�.)
		// A a = new A();   <== Ŭ������ ��üȭ ���Ѽ� �޸𸮿� �ε�  


class A {   // �ܺ� Ŭ���� (��ü�� ����� ���� ���赵)
	int m = 3; 			// m : �ʵ� (����) : Ŭ���� ������ ����� ������ �ʵ�� ȣĪ.
						// �ʵ�� �ν��Ͻ�ȭ(��ü) ���Ѿ� ����� ����
						// �ʵ�� �޸𸮿�  Heap ������ ����
	
	void print() {		// �޼ҵ� : �������� ����� �Լ� , ��ü ���⿡�� �Լ��� method�� ȣĪ 
		System.out.println("��ü ���� �� Ȱ��");
	}
}


class B {	// �ܺ� Ŭ����	 
	String Name = "ȫ�浿";
	int age = 24;
	String phone = "010-1111-1111";
	
	void printName () {
		System.out.println(name);
	}	
	
	void printAge () {
		System.out.println(age);
	}
	void printPhone () {
		System.out.println(phone);
	
	}
}


public class CreatObjectAndUsingOfMember {

	public static void main(String[] args) {

		A a = new A();				//Class A �� ��üȭ(�ν��Ͻ�ȭ == �޸𸮿� �ε�) ��Ų��.
		System.out.println(a.m);	
		a.print();
		
		System.out.println("=====================");
		
		A b = new A();			// Class A �� ��üȭ (�ν��Ͻ�ȭ) ���Ѽ� RAM�� �ε�
		
		System.out.println(b.m);
		b.print();
		
		A c = new A();
		System.out.println(c.m);
		c.print();
		
		System.out.println("======================");
		
		B bb = new B();		// B Class �� bb ��� �̸����� ��üȭ ��Ų��.
		bb.printName();		// bb ��ü�l �޼ҵ带 ȣ��
		bb.printAge();		// bb ������ �޼ҵ� ȣ��
		bb.printPhone();	
				
		B cc = new B();
		cc.printName();
		cc.printAge();
		cc.printPhone();
		
		
	}

}
