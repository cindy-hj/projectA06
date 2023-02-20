package projectA06;

public class projectA0615 {

	public static void main(String[] args) {
		for(int i=0; i<1000; i++) {
			System.out.println("작업1");
		}
		for(int i=0; i<1000; i++) {
			System.out.println("작업2");
		}
		for(int i=0; i<1000; i++) {
			System.out.println("작업3");
		}
		// 작업1 실행중에 작업2, 작업3 실행하도록 만들 수 있다-> thread 동시에 수행하도록 열어주는것
		
	}

}
