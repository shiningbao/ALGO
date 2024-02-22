package ex02.tostring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		int[] arr = new int[] {1,2,3};
		
		System.out.println(list);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		//toString() 은 다차원에서 통하지 않는다.
		int[][] apt = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.toString(apt));
		System.out.println(Arrays.deepToString(apt));
		
	}

}
