package projectA06;

class Tth_01 implements Runnable {
	@Override
	public void run() {
		int i=0;
		do {
			System.out.println("Read");
			i++;
		} while(i<1000);
	}
}

class Tth_02 extends Thread {
	@Override
	public void run() {
		int i=0;
		do {
			System.out.println("Write");
			i++;
		} while(i<1000);
	}
}

class Tth_03 implements Runnable {
	@Override
	public void run() {
		int i=0;
		do {
			System.out.println("Send");
			i++;
		} while(i<1000);
	}
}

public class projectA0625 {

	public static void main(String[] args) {
		Tth_01 tth_01 = new Tth_01();
		Tth_02 tth_02 = new Tth_02();
		Tth_03 tth_03 = new Tth_03();
	
		Thread tthr_01 = new Thread(tth_01);
		Thread tthr_03 = new Thread(tth_03);
		
		tthr_01.start();
		tth_02.start();
		tthr_03.start();
	}

}
