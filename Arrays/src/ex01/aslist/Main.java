package ex01.aslist;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		String[] str_arr = {"J","A","V","A","A","L","G","O"};
		int[] int_arr = {8,5,4,6,3,2,1};
		
		// List 변환
		List<String> multiValue = Arrays.asList(str_arr); // 문자열 배열이 list 로 변환
		System.out.println(multiValue); // [J, A, V, A, A, L, G, O]
		System.out.println(str_arr); // [Ljava.lang.String;@5d22bbb7
		
		// primitive type 은 리스트가 될 수 없다.
		// 즉, 기본 데이터 타입의 배열은 List 로 변경이 어렵다.
		// int -> Integer (Boxing), Integer -> int (Unboxing)
		// List<int[]> list = Arrays.asList(int_arr);
		// System.out.println(list);
		
		// List 로 변환된 배열은 add() 가 안된다.
		// multiValue.add("T"); // java.lang.UnsupportedOperationException
		// System.out.println(multiValue);
		
		multiValue.set(3,"a");
		System.out.println(multiValue);
		System.out.println(str_arr[3]); // set 은 사용할 수 있지만 원본 배열에도 영향을 미친다.
	}

}
