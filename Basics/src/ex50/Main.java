package ex50;

import java.util.HashMap;

/* 문자열 묶기
	문자열 배열 strArr이 주어집니다. strArr의 원소들을 길이가 같은 문자열들끼리 그룹으로 묶었을 때 가장 개수가 많은 그룹의 크기를 return 하는 solution 함수를 완성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new String[] {"a","bc","d","efg","hi"});
		System.out.println("2=="+result); 
	}
}

class Solution {
    public int solution(String[] strArr) { // 0.24ms ~ 27.09ms
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // 문자열 길이별 그룹의 개수를 카운트
        for (String str : strArr) {
            int length = str.length();
            map.put(length, map.getOrDefault(length, 0) + 1);
        }
        
        // 가장 개수가 많은 그룹의 크기를 찾음
        for (int count : map.values()) {
            answer = Math.max(answer, count);
        }
        return answer;
    }
}