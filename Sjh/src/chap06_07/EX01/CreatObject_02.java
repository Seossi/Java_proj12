package Chap06_07.EX01;

class Aaa {
	String name ;	 // �ʱ� : ��üȭ ���Ѿ� ��밡��
	int age ;		// �ʵ� ������ Heap ������ ����, Heap ������ ���� ������ ���� �ʱ�ȭ
	double weight;
	String email ;		// �ʵ�� ���� �ǰ� ���� �Ҵ��� ���� �ʴ� ��� : 
	boolean	man;				//���������� : Null, int : 0, double : 0.0 , boolean ; false
	
	
	
	public String getName() {		//�޼ҵ� ȣ��
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public void setMan(boolean b) {
		// TODO Auto-generated method stub
		
	}
	public void weight(int i) {
		// TODO Auto-generated method stub
		
	}
	public char[] getMan() {
		// TODO Auto-generated method stub
		return null;
	}
	public char[] getweight() {
		// TODO Auto-generated method stub
		return null;
	}
	
}









public class CreatObject_02 {

	public static void main(String[] args) {

		
		Aaa aaa = new Aaa();	//��ü����
		
		// �ʵ��� �ʱ� ���� ��� (Heap ������ ���� �ʱ�ȭ)
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		System.out.println(aaa.email);
		
		//������ ���� ���� ����
		aaa.name = " ȫ�浿";
		aaa.age = 30;
		aaa.weight = 70;
		aaa.man = true;
		aaa.email = "qweqwe@qwe.sdf";
			
		//������ ���� ���
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		System.out.println(aaa.email);		
		
		//setter�� ���ؼ� ���� ����
		aaa.setName(" ȫ�浿");
		aaa.setAge(10);
		aaa.weight(54);
		aaa.setMan (true);
		aaa.setEmail ("qweqwe@qwe.sdf");
		
		
		
		//getter �� ���ؼ� ���� ����
		System.out.println(aaa.getName());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmail());
		System.out.println(aaa.getMan());
		System.out.println(aaa.getweight());
		
		
		// �ϳ��� Ŭ�������� �������� ��ü�� ���� �� ���.
		
		Aaa bbb = new Aaa();
		Aaa ccc = new Aaa();
		Aaa ddd = new Aaa();
		
		
		
		
		
	}

}
