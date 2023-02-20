package projectA06;

import java.util.Scanner;

public class projectA0607 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String value1 = "";
		String value2 = "";
		
		int intValue1 = 0;
		int intValue2 = 0;
		
		for(;;) {
			try {
				System.out.println("첫번째 수를 입력하세요:");
				intValue1 = Integer.parseInt(in.nextLine());
				System.out.println("두번째 수를 입력하세요:");
				intValue2 = Integer.parseInt(in.nextLine());
				System.out.println("멈추려면 Q를 입력하세요:");
				if(in.nextLine().equals("Q")) {
					break;
				}
				
			} catch(NumberFormatException e) {
				try {
					System.out.println("첫번째 수를 입력하세요:");
					intValue1 = Integer.parseInt(in.nextLine());
					System.out.println("두번째 수를 입력하세요:");
					intValue2 = Integer.parseInt(in.nextLine());
				} catch(NumberFormatException e1) {
					
				}
			}
		}
	}

}
