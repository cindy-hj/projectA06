package projectA06;

public class projectA0624 {

	public static void main(String[] args) {
		int i=0;
		do {// Runnable
			System.out.println("Read");
			i++;
		} while(i<1000);
		
		i=0;
		do {// Thread
			System.out.println("write");
			i++;
		} while(i<1000);
		
		i=0;
		do {// Runnable
			System.out.println("Send");
		}while(i<1000);

	}

}
