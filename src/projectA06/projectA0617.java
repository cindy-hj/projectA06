package projectA06;

class ThreadR_01 implements Runnable{
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("작업1");
		}
	}
}

class ThreadR_02 implements Runnable{
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("작업2");
		}
	}
}

class ThreadR_03 implements Runnable{
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("작업3");
		}
	}
}

public class projectA0617 {

	public static void main(String[] args) {
		ThreadR_01 r01 = new ThreadR_01();
		ThreadR_02 r02 = new ThreadR_02();
		ThreadR_03 r03 = new ThreadR_03();
		
		Thread rth01 = new Thread(r01);
		Thread rth02 = new Thread(r02);
		Thread rth03 = new Thread(r03);

		rth01.start();
		rth02.start();
		rth03.start();
	}

}
