package ex40;

import java.util.Arrays;

/*	문자열 내 마음대로 정렬하기
	문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
	예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
*/
public class Main { 

	public static void main(String[] args) {
		String[] result = {};
		Solution sol = new Solution();
	
		result = sol.solution(new String[] {"sun", "bed", "car"}, 1); 
		System.out.println("[car, bed, sun]=="+Arrays.toString(result));

		result = sol.solution(new String[] {"abce", "abcd", "cdx"}, 2); 
		System.out.println("[abcd, abce, cdx]=="+Arrays.toString(result));
	}
	
}

class Solution {
    public String[] solution(String[] strings, int n) { // 9.53ms ~ 17.62ms
        String[] answer = new String[strings.length];
        
        for (int i = 0; i < strings.length; i++) {
			answer[i] = strings[i].charAt(n)+strings[i];
		}
        
        Arrays.sort(answer);
        
        for (int i = 0; i < answer.length; i++) {
			answer[i] = answer[i].substring(1);
		}
        
        return answer;
    }
}