package ex35;
// 원하는 문자열 찾기
public class Solution {

	public int solution(String myString, String pat) {
        int answer = 0;
        String low = myString.toLowerCase();
        String plow = pat.toLowerCase();
        
        answer = low.contains(plow)? 1 : 0;
        return answer;
    }
}
