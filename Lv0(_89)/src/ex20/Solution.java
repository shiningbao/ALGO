package ex20;
import java.util.Arrays;
// 중앙값 구하기
public class Solution {

	 public int solution(int[] array) {
	        int answer = 0;
//	        Arrays.sort(array);
//	        for (int i = 0; i < array.length; i++) {
//				answer = array[(array.length-1)/2];
//			} // 0.37ms~1.58ms
	        
	        Arrays.sort(array);
	        answer = array[array.length/2]; // 0.32ms~0.54ms
	        return answer;
	    }
	}

