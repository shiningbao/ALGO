package ex16;

import java.util.ArrayList;
import java.util.Arrays;

/*	ad 제거하기
	문자열 배열 strArr가 주어집니다. 
	배열 내의 문자열 중 "ad"라는 부분 문자열을 포함하고 있는 모든 문자열을 제거하고 남은 문자열을 순서를 유지하여 배열로 return 하는 solution 함수를 완성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		String[] result = {};
		Solution sol = new Solution();
		result = sol.solution(new String[] {"and","notad","abcd"});
		System.out.println("[\"and\",\"abcd\"]=="+Arrays.toString(result)); 		
		
		result = sol.solution(new String[]{"there","are","no","a","ds"});
		System.out.println("[\"there\",\"are\",\"no\",\"a\",\"ds\"]=="+Arrays.toString(result)); 		
	}

}

class Solution {
    public String[] solution(String[] strArr) { // 0.14ms~1.27ms
        ArrayList<String> answerList = new ArrayList<>();
        for (String str : strArr) {
            if (!str.contains("ad")) {
                answerList.add(str);
            }
        }
        // ArrayList를 배열로 변환
        String[] answer = answerList.toArray(new String[0]);
        return answer;
    }
}