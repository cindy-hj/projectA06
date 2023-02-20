package projectA06;

class MyClass<T> {
	// type엔 class로 올수 있는건 다 올 수 있음
	T val ;
	
	void set(T a) {
		val = a;
	}
	T get() {
		return val;
	}
}

public class projectA0614 {

	public static void main(String[] args) {
		MyClass<String> s = new MyClass<String>();
		s.set("hello");
		System.out.println(s.get());
		
		MyClass<Integer> n = new MyClass<Integer>();
		n.set(5);
		System.out.println(n.get());
		
	}

}
