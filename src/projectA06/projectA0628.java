package projectA06;

class TheThread extends Thread {
	int tag = 0;
	TheThread(int tag) {
		this.tag = tag;
	}
	
	@Override
	public void run() {
		if(this.tag==1) {
			// 1에서부터 100까지 5의 배수 합
			int sum = 0;
			for(int i=1; i<=100; i++) {
				if(i%5==0) {
					sum += i;
				}	
			}
			System.out.println("sum="+sum);
		} else if(this.tag == 2) {
			// 1에서부터 100까지 10의 배수 합
			int sum = 0;
			for(int i=1; i<=100; i++) {
				if(i%10==0) {
					sum += i;
				}	
			}
			System.out.println("sum="+sum);
		}
	}
}

public class projectA0628 {

	public static void main(String[] args) {
		TheThread theThread01 = new TheThread(1);
		TheThread theThread02 = new TheThread(2);
		theThread01.start();
		theThread02.start();
	}

}
