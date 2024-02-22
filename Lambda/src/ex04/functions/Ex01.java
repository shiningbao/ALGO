package ex04.functions;

import java.util.function.Supplier;

public class Ex01 {

	public static void main(String[] args) {
	
		// 인터페이스를 구현해서 람다식을 사용하기 귀찮으니 java 에서 특정 형태의 메서드를 제공하는 인터페이스를 만들어 줬다.
		// 제공인터페이스<반환타입>
		Supplier<MyClass> inter = null;
		
		// 1. Lambda 미사용
		inter = new Supplier<MyClass>() {
			@Override
			public MyClass get() {
				return new MyClass();
			}
		};
		// 2. Lambda 사용
		inter = ()->new MyClass();
		
		// 3. 메서드 참조
		inter = MyClass::new;
		

		
	}
	
}
	


class MyClass{}