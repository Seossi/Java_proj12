package chap03;
	Public class OperatorEx01 {
		public static void main(String[] args) {
			int data = 13;		//
			
			System.out.println(Integer.toBinaryString(data));		// 십진수 13을 2지누로 변환	
			System.out.println(Integer.toOctalString(data));	// 8
			System.out.println(Integer.toHexString(data));	//16
			System.out.println();
			
			System.out.println(Integer.parseInt("1101", 2)); 	//2진수를 10진수로 변환
			System.out.println(Integer.parseInt("15", 8));		//8진수를 10진수로 변환
			System.out.println(Integer.parseInt("0d", 16));   // 16진수를 10진수로 변환
				
			System.out.println("==============================");
			
			System.out.println(~3);  // 양수를 ~ 를 하면, 음수가 적용 : 0을 기준으로 계산 + 1
			System.out.println(~7);		//
	
			//다양한 진법표현
			
			System.out.println(13);
			System.out.println(0b1101); //0b 2진법
			System.out.println(015);	//0 8진법
			System.out.println(0x0d);	//0x0D 16진수 표현
			System.out.println("=====================");
			
		}

}
