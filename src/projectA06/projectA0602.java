package projectA06;

public class projectA0602 {

	public static void main(String[] args) {
		try {
//			Exception e=new Exception("고의로 발생시켰음");
//			throw e;
			throw new Exception("고의로 발생시켰음");
		} catch(Exception e) {
			System.out.println("에러메시지:"+e.getMessage());
		}
		System.out.println("프로그램이 정상 종료되었음");
	}

}
