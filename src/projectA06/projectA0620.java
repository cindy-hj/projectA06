package projectA06;

class Th01 implements Runnable {
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("안녕하세요");
		}
	}
}

class Th02 implements Runnable {
	public void run() {
		for(int i=0; i<200; i++) {
			System.out.println("Hi");
		}
	}
}

class Th03 implements Runnable {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("반가워요");
		}
	}
}
public class projectA0620 {

	public static void main(String[] args) {
		Th01 r01 = new Th01();
		Th02 r02 = new Th02();
		Th03 r03 = new Th03();
		
		Thread rth01 = new Thread(r01);
		Thread rth02 = new Thread(r02);
		Thread rth03 = new Thread(r03);

		rth01.start();
		rth02.start();
		rth03.start();
	}

}
