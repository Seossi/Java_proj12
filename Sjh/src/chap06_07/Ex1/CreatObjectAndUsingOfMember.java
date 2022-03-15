package chap06_07.Ex1;

class AA {   // 외부 클래스 (객체를 만들기 위한 설계도)
	
	String name;		//필드(맴버) : 인스턴스화 시켜야 사용이 가능
	int age;			
	String email;
	
	
	public String getName() {		// 메소드 (맴버) : 인스턴스화 시켜야 사용가능
		return name;				//Heap  공간에 주소만 저장, 클래스 영역내의 메소드 영역에 저장
	}
	public void setName(String name) {	// void : 리턴값이 없다를 알려주는 식별자			
		this.name = name;		//홍길동이라는 변수가 입력되면  String 에 입력
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

		AA aa = new AA(); // AA클래스 ( 설계도 )를 aa(객체)를 생성
		
		
		//객체의 메소드 호출
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println(aa.getEmail());
		
		
		System.out.println("================");
		
		//객체의 필드 호출
		System.out.println(aa.name);
		System.out.println(aa.age);
		System.out.println(aa.email);
		
		//==============================
		
		
		
		//메소드 호출 
		System.out.println("======================");
		
		
		//setters : 객체의 메모리에 값을 할당할때
		aa.setName("홍길동");				//객체의 변수에 값을 할당  메모리에 씀.
		aa.setAge(29);					//객체의 변수에 값을 할당
		aa.setEmail("aaaa@asd.asdd");	//객체의 변수에 값을 할당
		
		
		System.out.println(aa.getName());  //메모리의 객체 값을 불러올때
		System.out.println(aa.getAge());	//메모리의 객체 값을 불러올때
		System.out.println(aa.getEmail());	//메모리의 객체 값을 불러올때
		
		//====================================
		
		System.out.println("=====================");
		
		AA bb = new AA();
		bb.setName("김유신");
		bb.setAge(50);
		bb.setEmail("bb@ss.ss");
		
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println(bb.getEmail());
		
		System.out.println("======================");
		
		AA cc = new AA();
		cc.setName("신사임당");
		cc.setAge(90);
		cc.setEmail("cccc@asd.asd");
		
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println(cc.getEmail());
		
	}

}
