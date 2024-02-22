package ex04.functions;

import java.util.function.Function;

public class Ex02 {

	public static void main(String[] args) {
		
		// 제공 인터페이스<매개변수타입,반환타입> - 매개변수와 반환타입 둘 다 있는 메서드 제공
		Function<String, Integer> inter = null;
		
		// 1. lambda 미사용
		inter = new Function<String, Integer>() {
			@Override
			public Integer apply(String t) {
				return Integer.parseInt(t);
			}
		};
		// 2. lambda 사용
		inter = t->  Integer.parseInt(t);
		
		// 3. 메서드 참조
		inter = Integer::parseInt;
		
		
		
		
		
		
		
		
		
		
	}

}
