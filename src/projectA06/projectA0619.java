package projectA06;

// 같은 패키지 내에서 동일한 쓰레드 이름 생성 안됨
class Th_01 extends Thread {
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("안녕하세요");
		}
	}
}

class Th_02 extends Thread {
	public void run() {
		for(int i=0; i<200; i++) {
			System.out.println("Hi");
		}
	}
}

class Th_03 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println("반가워요");
		}
	}
}

public class projectA0619 {

	public static void main(String[] args) {
		Th_01 th01 = new Th_01();
		Th_02 th02 = new Th_02();
		Th_03 th03 = new Th_03();
		
		th01.start();
		th02.start();
		th03.start();

	}

}
