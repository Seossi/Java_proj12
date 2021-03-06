package chap06_07.Ex6;

// 객체의 필드에 값을 할당하는 방식 : 3가지
	// 1. 필드에 직접 값을 부여하는 방식							<< 객체를 생성후
	// 2. setter 를 통해서 객체에 필드에 값을 부여. ( 컨트롤이 된다)  << 객체를 생성후
	// 3. 생성자를 통해서 객체의 필드 값을 부여 (컨트롤 된다)			<< 객체를 생성할때 초기값으로 필드에 값을 할당


class Aa{		// 1. 객체 생성후 직접 필드에 값 할당
	String name; // 이름
	int age;	// 나이
	String mail; //메일주소
	
	void print () {
		System.out.println("name : " + name + "age : " + age + "mail : " + mail);
	}
}





class Bb{		// 2. setter 를 통해서 객체의 필드에 값을 할당
	String name; // 이름
	int age;	// 나이
	String mail;	//메일주소
	
	
	
	
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




class Cc{		// 3. 생성자를 통해서 객체의 필드 값을 할당
	
	String name; // 이름
	int age;	// 나이
	String mail;	//메일주소
	
	Cc(String name, int age, String mail){   //생성자에서 매개변수 3개를 받아서 
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


		//1. 객체의 필드에 직업 값을 할당.
		
		System.out.println();
		System.out.println("============ 1 =============");
		
		Aa a = new Aa();
		
		a.name = "이름 1 ";
		a.age = 20;
		a.mail = " one@qwe.qwe";
		
		a.print();
		
		System.out.println();
		System.out.println("============ 2 =============");
		
		//2. 객체의 setter를 사용하여 필드의 값을 부여.
		
		Bb b = new Bb();
		
		b.setName("이름2");
		b.setAge(30);
		b.setMail("two@nae.qwe");
		
		b.print();
		
		System.out.println();
		System.out.println("============ 3===============");
		
		//3. 생성자를 사용해서 필드의 값을 부여. (객체를 생성할때 필드의 값을 초기화)
		
		Cc c = new Cc(" 세종대왕", 60 ,"3333@3333.333");
							
		c.print();
		

		
		
		
	}

}
