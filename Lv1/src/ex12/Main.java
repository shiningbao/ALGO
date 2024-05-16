package ex12;

import java.util.Arrays;

/* 	정수 내림차순으로 배치하기
	함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
	예를들어 n이 118372면 873211을 리턴하면 됩니다.
*/
public class Main {

	public static void main(String[] args) {
		long result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(118372); 
		System.out.println("873211=="+result); 
	}
}

class Solution {
    public long solution(long n) { // 1.35ms ~ 2.15ms
        long answer = 0;
        String strN = Long.toString(n);
        String[] strNarr = strN.split("");
        
        Arrays.sort(strNarr);
        
        String str = "";
        for (int i = strNarr.length-1; i >= 0; i--) {
			str += strNarr[i];
		}
        
        answer = Long.parseLong(str);

        return answer;
    }
}