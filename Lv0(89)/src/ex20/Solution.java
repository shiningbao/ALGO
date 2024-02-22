package ex20;

import java.util.Arrays;

// 중앙값 구하기
public class Solution {

	 public int solution(int[] array) {
	        int answer = 0;
	        int[] copy = Arrays.copyOf(array, array.length);
	        Arrays.sort(copy);
	        System.out.println(copy);
	        return answer;
	    }
	}

