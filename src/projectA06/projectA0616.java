package projectA06;

// 쓰레드를 상속하거나 인터페이스를 상속해서 쓰레드 만들 수 있음
class Thread_01 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("작업1");
		}
	}
}

class Thread_02 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("작업2");
		}
	}
}

class Thread_03 extends Thread{
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("작업3");
		}
	}
}

public class projectA0616 {

	public static void main(String[] args) {
		Thread_01 th01 = new Thread_01();
		Thread_02 th02 = new Thread_02();
		Thread_03 th03 = new Thread_03();

		th01.start();
		th02.start();
		th03.start();
	}

}
