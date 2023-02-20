package projectA06;

class Thr01 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while(i<100) {
			System.out.println("Test");
			i++;
		}
	}
}

class Thr02 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while(i<100) {
			System.out.println("Send");
			i++;
		}
	}
}

class Thr03 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while(i<100) {
			System.out.println("Read");
			i++;
		}
	}
}

public class projectA0622 {

	public static void main(String[] args) {
		
		Thr01 tt01 = new Thr01();
		Thr02 tt02 = new Thr02();
		Thr03 tt03 = new Thr03();
		
		tt01.start();
		tt02.start();
		tt03.start();
		
	}

}
