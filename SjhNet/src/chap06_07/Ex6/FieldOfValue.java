package chap06_07.Ex6;

// ��ü�� �ʵ忡 ���� �Ҵ��ϴ� ��� : 3����
	// 1. �ʵ忡 ���� ���� �ο��ϴ� ���							<< ��ü�� ������
	// 2. setter �� ���ؼ� ��ü�� �ʵ忡 ���� �ο�. ( ��Ʈ���� �ȴ�)  << ��ü�� ������
	// 3. �����ڸ� ���ؼ� ��ü�� �ʵ� ���� �ο� (��Ʈ�� �ȴ�)			<< ��ü�� �����Ҷ� �ʱⰪ���� �ʵ忡 ���� �Ҵ�


class Aa{		// 1. ��ü ������ ���� �ʵ忡 �� �Ҵ�
	String name; // �̸�
	int age;	// ����
	String mail; //�����ּ�
	
	void print () {
		System.out.println("name : " + name + "age : " + age + "mail : " + mail);
	}
}





class Bb{		// 2. setter �� ���ؼ� ��ü�� �ʵ忡 ���� �Ҵ�
	String name; // �̸�
	int age;	// ����
	String mail;	//�����ּ�
	
	
	
	
	public String getName() {
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




	public String getMail() {
		return mail;
	}




	public void setMail(String mail) {
		this.mail = mail;
	}

	



	void print () {
		System.out.println("name : " + name + "age : " + age + "mail : " + mail);
	}
}




class Cc{		// 3. �����ڸ� ���ؼ� ��ü�� �ʵ� ���� �Ҵ�
	
	String name; // �̸�
	int age;	// ����
	String mail;	//�����ּ�
	
	Cc(String name, int age, String mail){   //�����ڿ��� �Ű����� 3���� �޾Ƽ� 
		this.name = name;	
		this.age = age;	
		this.mail = mail;	
	}
	
	
	
	public void print () {
		System.out.println("name : " + name + "age : " + age + "mail : " + mail);
	}
}





public class FieldOfValue {

	public static void main(String[] args) {


		//1. ��ü�� �ʵ忡 ���� ���� �Ҵ�.
		
		System.out.println();
		System.out.println("============ 1 =============");
		
		Aa a = new Aa();
		
		a.name = "�̸� 1 ";
		a.age = 20;
		a.mail = " one@qwe.qwe";
		
		a.print();
		
		System.out.println();
		System.out.println("============ 2 =============");
		
		//2. ��ü�� setter�� ����Ͽ� �ʵ��� ���� �ο�.
		
		Bb b = new Bb();
		
		b.setName("�̸�2");
		b.setAge(30);
		b.setMail("two@nae.qwe");
		
		b.print();
		
		System.out.println();
		System.out.println("============ 3===============");
		
		//3. �����ڸ� ����ؼ� �ʵ��� ���� �ο�. (��ü�� �����Ҷ� �ʵ��� ���� �ʱ�ȭ)
		
		Cc c = new Cc(" �������", 60 ,"3333@3333.333");
							
		c.print();
		

		
		
		
	}

}
