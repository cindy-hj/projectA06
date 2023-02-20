package projectA06;

// io에 있는 모든 클래스를 읽어온다
import java.io.*;

public class projectA0631 {
	public static void main(String[] args) {
		FileReader fin = null;
		try {
			// ctrl키 누르고 FileReader 누르면 내부 클래스 볼 수 있음
			fin = new FileReader("C:\\windows\\system.ini");
			int c;
			while((c=fin.read())!=-1) {
				System.out.print((char)c);
			}
			fin.close();
		}catch(IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
