package projectA06;

class forThread01 extends Thread {
	@Override
	public void run() {
		int i=0;
		int sum=0;
		for(;;) {
			if(i==100) {
				break;
			}
			try {
				// 한번 동작할때마다 1초씩 쉬도록 함, 예외 발생하므로 try-catch 안에
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
			sum = sum + i;
		}
		System.out.println("sum = "+sum);
	}
}

public class projectA0626 {

	public static void main(String[] args) {
		forThread01 fthread = new forThread01();
		fthread.start();

	}

}
