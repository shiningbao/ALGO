package ex04.functions;

import java.util.function.Function;

public class Ex03 {

	public static void main(String[] args) {
		
		Function<Integer, int[]> func = null;
		
		// 1. lambda 미사용
		func = new Function<Integer, int[]>() {
			@Override
			public int[] apply(Integer t) {
				return new int[t];
			}
		};
		// 2. lambda 사용
		func = t-> new int[t];

		// 3. 메서드 참조
		func = int[] :: new; // int배열을 가지고 생성할거다. 
		
		int[] arr = func.apply(3);
		System.out.println(arr.length);
		
		
		
		
	
			
		
		
		
		
		
		
		
		
		
		
	}
	

}
