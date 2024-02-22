package ex03.copy;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	
		int[] numlist = new int[9]; // 아무것도 안넣으면 기본 0으로 채운다.
		Arrays.fill(numlist, 9); // 특정한 값을 특정 배열에 채워라
		System.out.println(Arrays.toString(numlist));
	
		// 복사(원본배열,복사할길이)
		int[] copy = {};
		copy = Arrays.copyOf(numlist, numlist.length);
		System.out.println(Arrays.toString(copy));
		
		// 배열크기 보다 복사길이를 짧게(해당 부분 만큼만 복사)
		copy = Arrays.copyOf(numlist, 5);
		System.out.println(Arrays.toString(copy));
		
		// 배열크기 보다 복사길이를 길게(남은 부분은 0 으로 채운다.)
		copy = Arrays.copyOf(numlist, 10);
		System.out.println(Arrays.toString(copy));
		
		String str = "우리는 알고리즘을 위해 Arrays class 를 배우고 있습니다.";
		// Arrays class 만 추출
		// String sub = str.substring(13, 25);
		// System.out.println(sub);
		String[] strArr = str.substring(13, 25).split("");
		System.out.println(Arrays.toString(strArr));
		
		char[]arr = str.toCharArray();
		System.out.println(Arrays.toString(arr));
		//copyOfRange() 를 이용해서 Arrays class 만 추출
		char[] cor = Arrays.copyOfRange(arr, 13, 25);
		System.out.println(Arrays.toString(cor));
	}

}
