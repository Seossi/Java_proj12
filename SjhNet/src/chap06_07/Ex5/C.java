package chap06_07.Ex5;

public class C {

	
	//필드에 부여되는 접근 제어자
	
	private String company = "현대자동차" ; 	
	String model ; // 모델  , default
	protected String color =  "red";  
	public int maxSpeed; 
	
	public void setModel (String model) {
		this.model = model;
	}
	
	public void setColor(String color) {
		this.color = color;
		
	}
	
	public void setCompany(String company) {
		this.maxSpeed = maxSpeed;
		
	}
	
	
	public void print() {
			System.out.println("company" + company + "model" + model + "color" + color + "maxSpeed" + maxSpeed );
	}

}
