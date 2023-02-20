package projectA06;

import java.io.IOException;

public class projectA0603 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			// 입출력 관련된 예외, 파일을 읽지못할때, 쓰지 못할때...
			throw new IOException("IO Error");
//			System.out.println(0/0);
//			System.out.println(4);
			
		} catch (IOException e) {
			// 발생된 예외에 대한 정보 출력
			e.printStackTrace();
			System.out.println("예외메시지:"+e.getMessage());
		} catch(ArithmeticException ae) {
			
		} catch(Exception e) {
			
		}

	}

}
