package chap06_07.Ex1;

class AA {   // �ܺ� Ŭ���� (��ü�� ����� ���� ���赵)
	
	String name;		//�ʵ�(�ɹ�) : �ν��Ͻ�ȭ ���Ѿ� ����� ����
	int age;			
	String email;
	
	
	public String getName() {		// �޼ҵ� (�ɹ�) : �ν��Ͻ�ȭ ���Ѿ� ��밡��
		return name;				//Heap  ������ �ּҸ� ����, Ŭ���� �������� �޼ҵ� ������ ����
	}
	public void setName(String name) {	// void : ���ϰ��� ���ٸ� �˷��ִ� �ĺ���			
		this.name = name;		//ȫ�浿�̶�� ������ �ԷµǸ�  String �� �Է�
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}



public class CreatObjectAndUsingOfMember {

	public static void main(String[] args) {

		AA aa = new AA(); // AAŬ���� ( ���赵 )�� aa(��ü)�� ����
		
		
		//��ü�� �޼ҵ� ȣ��
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		
		System.out.println("================");
		
		//��ü�� �ʵ� ȣ��
		System.out.println(aa.name);
		System.out.println(aa.age);
		System.out.println(aa.email);
		
		//==============================
		
		
		
		//�޼ҵ� ȣ�� 
		System.out.println("======================");
		
		
		//setters : ��ü�� �޸𸮿� ���� �Ҵ��Ҷ�
		aa.setName("ȫ�浿");				//��ü�� ������ ���� �Ҵ�  �޸𸮿� ��.
		aa.setAge(29);					//��ü�� ������ ���� �Ҵ�
		aa.setEmail("aaaa@asd.asdd");	//��ü�� ������ ���� �Ҵ�
		
		
		System.out.println(aa.getName());  //�޸��� ��ü ���� �ҷ��ö�
		System.out.println(aa.getAge());	//�޸��� ��ü ���� �ҷ��ö�
		System.out.println(aa.getEmail());	//�޸��� ��ü ���� �ҷ��ö�
		
		//====================================
		
		System.out.println("=====================");
		
		AA bb = new AA();
		bb.setName("������");
		bb.setAge(50);
		bb.setEmail("bb@ss.ss");
		
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		
		System.out.println("======================");
		
		AA cc = new AA();
		cc.setName("�Ż��Ӵ�");
		cc.setAge(90);
		cc.setEmail("cccc@asd.asd");
		
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
		
	}

}
