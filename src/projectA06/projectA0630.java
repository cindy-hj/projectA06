package projectA06;

class A{
	A(){
		System.out.println("A 객체가 생성됨");
	}
	
	public class B{
		B() {
			System.out.println("B 객체가 생성됨");
		}
		int field1;
		void method() {}
	}
	
	static class C{
		C(){
			System.out.println("C 객체가 생성됨");
		}
		int field1;
		static int field2;
		void method() {}
		static void method2() {}
	}
	
	void method() {
		class D{
			D() {
				System.out.println("D 객체가 생성됨");
			}
			int field1;
			void method() {
				
			}
		}
		// 지역 클래스..?이므로 사용해야 의미 있는것
		D d=new D();
		d.field1=3;
		d.method();
	}
}

public class projectA0630 {

	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		b.field1 = 3;
		b.method();
		
		A.C c = new A.C();
		c.field1 = 3;
		c.method();
		
		A.C.field2 = 3;
		A.C.method2();
		
		a.method();
	}

}
