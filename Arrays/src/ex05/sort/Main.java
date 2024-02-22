package ex05.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		int[] num_list = {1,9,2,5,3,4,8,7,6};
		String[] str_list = {"q","w","e","r","a","s","d","f","z","x","c","v","b"};
		// sort 는 원본 배열을 건드린다.
		// 오름차순 정렬 
		Arrays.sort(num_list);
		Arrays.sort(str_list);
		System.out.println(Arrays.toString(num_list));
		System.out.println(Arrays.toString(str_list));
		
		// 내림차순 정렬
		Arrays.sort(str_list, Comparator.reverseOrder());
		System.out.println(Arrays.toString(str_list));
		// 기본데이터타입은 역정렬을 할 수 없다.
		// Comparator 은 내부적으로 제너릭을 사용하므로 클래스형 타입이 들어가야만 한다.
		// Arrays.sort(num_list, Comparator.reverseOrder());
	}

}
