package projectA06;

public class projectA0608 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}

	} 
	static void method1() throws Exception { // throws 쓰려면 앞에서 발생한 예외를 던져줘야함
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method1 메서드에서 예외가 처리되었습니다.");
			e.printStackTrace();
		}
	}
}
