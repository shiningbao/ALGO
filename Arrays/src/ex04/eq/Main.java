package ex04.eq;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		int[] arr3 = {3,2,1};  
		
		boolean eq = Arrays.equals(arr1, arr2);
		System.out.println(eq); // true
		eq = Arrays.equals(arr2, arr3);
		System.out.println(eq); // false
		
		// 대소문자를 구분한다.
		String[] str1 = "java".split("");
		String[] str2 = "JAVA".split("");
		eq = Arrays.equals(str1, str2);
		System.out.println(eq); // false

		int[][] marr1 = {{1,2,3},{4,5,6}};
		int[][] marr2 = {{1,2,3},{3,4,5}};
		System.out.println("multi array equals : "+Arrays.deepEquals(marr1, marr2)); // false
		
		// java 1.9 부터 지원되는 compare 
		System.out.println("같으면 0 : "+Arrays.compare(new int[] {1,2,3}, new int[] {1,2,3}));
		System.out.println("앞 배열이 크면 1 : "+Arrays.compare(new int[] {1,2,5}, new int[] {1,2,3}));
		System.out.println("뒷 배열이 크면 -1 : "+Arrays.compare(new int[] {1,2,3}, new int[] {1,2,5}));
	}

}
