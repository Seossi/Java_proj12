package Chap06_07.EX01;

class Aaa {
	String name ;	 // 필그 : 객체화 시켜야 사용가능
	int age ;		// 필드 값들은 Heap 영역에 저장, Heap 영역의 변수 값들은 강제 초기화
	double weight;
	String email ;		// 필드는 선언만 되고 값이 할당이 되지 않는 경우 : 
	boolean	man;				//참조변수는 : Null, int : 0, double : 0.0 , boolean ; false
	
	
	
	public String getName() {		//메소드 호출
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

		
		Aaa aaa = new Aaa();	//객체생성
		
		// 필드의 초기 값을 출력 (Heap 영역은 강제 초기화)
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		System.out.println(aaa.email);
		
		//변수의 값을 직접 대입
		aaa.name = " 홍길동";
		aaa.age = 30;
		aaa.weight = 70;
		aaa.man = true;
		aaa.email = "qweqwe@qwe.sdf";
			
		//변수에 값을 출력
		System.out.println(aaa.name);
		System.out.println(aaa.age);
		System.out.println(aaa.weight);
		System.out.println(aaa.man);
		System.out.println(aaa.email);		
		
		//setter를 통해서 값을 대입
		aaa.setName(" 홍길동");
		aaa.setAge(10);
		aaa.weight(54);
		aaa.setMan (true);
		aaa.setEmail ("qweqwe@qwe.sdf");
		
		
		
		//getter 를 동해서 값을 대입
		System.out.println(aaa.getName());
		System.out.println(aaa.getAge());
		System.out.println(aaa.getEmail());
		System.out.println(aaa.getMan());
		System.out.println(aaa.getweight());
		
		
		// 하나의 클래스에서 여러개의 객체를 생성 및 사용.
		
		Aaa bbb = new Aaa();
		Aaa ccc = new Aaa();
		Aaa ddd = new Aaa();
		
		
		
		
		
	}

}
