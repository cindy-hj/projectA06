package projectA06;

public class projectA0606 {

	public static void main(String[] args) {
		String value1 = "100";
		String value2 = "a100";
		
		int intValue1 = 0;
		int intValue2 = 0;
		
		try {
			intValue1 = Integer.parseInt(value1);
			intValue2 = Integer.parseInt(value2);
		} catch(NumberFormatException e) {
			value2 = "100";
			intValue2 = Integer.parseInt(value2);
		}
		int result = intValue1 + intValue2;
		System.out.println("결과는 "+result);

	}

}
