package projectA06;

class for1Thread implements Runnable {
	@Override
	public void run() {
		// 1에서부터 100까지 짝수를 더하는 프로그램을 작성하시오
		// break;
		// sleep(100)
		int i=0;
		int sum=0;
		for(;;) {
			if(i%2==0) {
				sum += i;
			}
			// Runnable에는 sleep 설정 안됨
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
			if(i>100) {
				break;
			}
		}
		System.out.println("sum="+sum);		
	}
}

public class projectA0627 {

	public static void main(String[] args) {
		// thread에 instance 주지 않고 바로 instance화
		Thread th = new Thread(new for1Thread());
		th.start();
	}

}
