package Chap06_07.Ex02;


public class Example_Car {

	public static void main(String[] args) {
			// car class �� ��üȭ�ؼ� 5���� ��ü�� ���� ���� �Ҵ��ؼ� ���
		

	
		
		
		System.out.println("================sonata=========================");

		Car sonata = new Car();
		System.out.println();
		
		
		sonata.setColor ("red"); 
		sonata.setCompany( "hyundea");
		sonata.setMaxSpeed (200);
		sonata.setModel("2002");
		
	
		System.out.println("�������� :" + sonata.getColor());
		System.out.println("������ : " + sonata.getCompany());
		System.out.println("�ִ� �ӵ� :" + sonata.getMaxSpeed());
		System.out.println("���� : " + sonata.getModel());
		
		
		System.out.println("=========================================");
		
		System.out.println("================avante=========================");

		Car avante = new Car();
		System.out.println();
		
		
		avante.setColor ("green"); 
		avante.setCompany( "hyundea");
		avante.setMaxSpeed (190);
		avante.setModel("2020");
		
	
		System.out.println("�������� :" + avante.getColor());
		System.out.println("������ : " + avante.getCompany());
		System.out.println("�ִ� �ӵ� :" + avante.getMaxSpeed());
		System.out.println("���� : " + avante.getModel());
		
		
		System.out.println("=========================================");
		System.out.println("================tico=========================");

		Car tico = new Car();
		System.out.println();
		
		
		tico.setColor ("white"); 
		tico.setCompany( "hyundea");
		tico.setMaxSpeed (120);
		tico.setModel("1990");
		
	
		System.out.println("�������� :" + tico.getColor());
		System.out.println("������ : " + tico.getCompany());
		System.out.println("�ִ� �ӵ� :" + tico.getMaxSpeed());
		System.out.println("���� : " + tico.getModel());
		
		
		System.out.println("=========================================");
		System.out.println("================ k5=========================");

		Car  k5 = new Car();
		System.out.println();
		
		
		 k5.setColor("white"); 
		 k5.setCompany( "kia");
		 k5.setMaxSpeed (220);
		tico.setModel("2020");
		
	
		System.out.println("�������� :" + k5.getColor());
		System.out.println("������ : " + k5.getCompany());
		System.out.println("�ִ� �ӵ� :" + k5.getMaxSpeed());
		System.out.println("���� : " + k5.getModel());
		
		
		System.out.println("=========================================");
		System.out.println("===================musso======================");

		Car musso = new Car();
		System.out.println();
		
		
		musso.setColor ("�������� :" + "black"); 
		musso.setCompany( "ssangyong");
		musso.setMaxSpeed (180);
		musso.setModel("1999");
		
	
		System.out.println("�������� :" + musso.getColor());
		System.out.println("������ : " + musso.getCompany());
		System.out.println("�ִ� �ӵ� :" + musso.getMaxSpeed());
		System.out.println("���� : " + musso.getModel());
		
		
		System.out.println("=========================================");
		
	}

}
