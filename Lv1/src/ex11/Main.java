package ex11;

import java.util.Arrays;

/* 	자연수 뒤집어 배열로 만들기
	자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(12345); 
		System.out.println("[5, 4, 3, 2, 1]=="+Arrays.toString(result)); 
	}
}

class Solution {
    public int[] solution(long n) { // 0.12ms ~ 0.19ms
        String strN = Long.toString(n);
        String[] strNarr = strN.split("");
        int[] answer = new int[strNarr.length];
        
        for (int i = strNarr.length - 1, j = 0; i >= 0; i--, j++) {
            String temp = strNarr[i];
            answer[j] = Integer.parseInt(temp);
        }

        return answer;
    }
}