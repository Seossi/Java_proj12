package Ex03.copy;

class Car {
	String company;		// 필드(인스턴스 필드)의 company 를 알려주는 this
	String model;		// 인스턴스 : 객체화를 했을때 사용 가능한 필드.
	String color;		// [필드명 : 필드의 값]은 Heap 영역에 저장 
	double maxSpeed;
	
	Car () {} // 기본 생성자
	
	Car (String company, String model, String color, double max){
	
	this.company = company;		// this 키는 객체의 필드의 변수를 뜻함
	this.model = model;			// 3개의 변수 모두가 동일할 경우 객체의 필드의 변수를 알려주는 역활
	this.color = color;
	maxSpeed = max;		// this  키워드가 생략된 상태
	
	}									// 인스턴스는 객체화 시켜야 사용가능!!!!!!
	void work() {				// 메소드  (인스턴스 메소드) : Heap 영역에 메소드명과 포인터를 저장
		System.out.print(company);	// 메소드의 전체 구문은 클레스 영역의 메소드 영역에 저장
		System.out.print(model);
		System.out.print(color);
		System.out.print(maxSpeed);
	}
}


public class Q1 {

	public static void main(String[] args) {
		// 셍성자를 통해서 기본값을 하랑한 후 메모리의 내용을 work() 메소드를 사용해서 출력.
		
		
		Car car1 = new Car ("현대", "소나타", "빨강", 220.0);
		car1.work();
		
		

	}

}
