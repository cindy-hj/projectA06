package projectA06;

class tthr_01 implements Runnable {
	@Override
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Test");
			i++;
		}
	}
}

class tthr_02 implements Runnable {
	@Override
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Send");
			i++;
		}
	}
}

class tthr_03 implements Runnable {
	@Override
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Read");
			i++;
		}
	}
}

public class projectA0623 {

	public static void main(String[] args) {
		tthr_01 r01 = new tthr_01();
		tthr_02 r02 = new tthr_02();
		tthr_03 r03 = new tthr_03();
		
		Thread th01 = new Thread(r01);
		Thread th02 = new Thread(r02);
		Thread th03 = new Thread(r03);

		th01.start();
		th02.start();
		th03.start();

	}

}
