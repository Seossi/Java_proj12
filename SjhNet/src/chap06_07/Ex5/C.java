package chap06_07.Ex5;

public class C {

	
	//�ʵ忡 �ο��Ǵ� ���� ������
	
	private String company = "�����ڵ���" ; 	
	String model ; // ��  , default
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
