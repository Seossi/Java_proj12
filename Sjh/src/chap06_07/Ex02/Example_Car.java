package Chap06_07.Ex02;


public class Example_Car {

	public static void main(String[] args) {
			// car class 를 객체화해서 5갱의 객체를 생성 값을 할당해서 출력
		

	
		
		
		System.out.println("================sonata=========================");

		Car sonata = new Car();
		System.out.println();
		
		
		sonata.setColor ("red"); 
		sonata.setCompany( "hyundea");
		sonata.setMaxSpeed (200);
		sonata.setModel("2002");
		
	
		System.out.println("차량색상 :" + sonata.getColor());
		System.out.println("제조사 : " + sonata.getCompany());
		System.out.println("최대 속도 :" + sonata.getMaxSpeed());
		System.out.println("연식 : " + sonata.getModel());
		
		
		System.out.println("=========================================");
		
		System.out.println("================avante=========================");

		Car avante = new Car();
		System.out.println();
		
		
		avante.setColor ("green"); 
		avante.setCompany( "hyundea");
		avante.setMaxSpeed (190);
		avante.setModel("2020");
		
	
		System.out.println("차량색상 :" + avante.getColor());
		System.out.println("제조사 : " + avante.getCompany());
		System.out.println("최대 속도 :" + avante.getMaxSpeed());
		System.out.println("연식 : " + avante.getModel());
		
		
		System.out.println("=========================================");
		System.out.println("================tico=========================");

		Car tico = new Car();
		System.out.println();
		
		
		tico.setColor ("white"); 
		tico.setCompany( "hyundea");
		tico.setMaxSpeed (120);
		tico.setModel("1990");
		
	
		System.out.println("차량색상 :" + tico.getColor());
		System.out.println("제조사 : " + tico.getCompany());
		System.out.println("최대 속도 :" + tico.getMaxSpeed());
		System.out.println("연식 : " + tico.getModel());
		
		
		System.out.println("=========================================");
		System.out.println("================ k5=========================");

		Car  k5 = new Car();
		System.out.println();
		
		
		 k5.setColor("white"); 
		 k5.setCompany( "kia");
		 k5.setMaxSpeed (220);
		tico.setModel("2020");
		
	
		System.out.println("차량색상 :" + k5.getColor());
		System.out.println("제조사 : " + k5.getCompany());
		System.out.println("최대 속도 :" + k5.getMaxSpeed());
		System.out.println("연식 : " + k5.getModel());
		
		
		System.out.println("=========================================");
		System.out.println("===================musso======================");

		Car musso = new Car();
		System.out.println();
		
		
		musso.setColor ("차량색상 :" + "black"); 
		musso.setCompany( "ssangyong");
		musso.setMaxSpeed (180);
		musso.setModel("1999");
		
	
		System.out.println("차량색상 :" + musso.getColor());
		System.out.println("제조사 : " + musso.getCompany());
		System.out.println("최대 속도 :" + musso.getMaxSpeed());
		System.out.println("연식 : " + musso.getModel());
		
		
		System.out.println("=========================================");
		
	}

}
