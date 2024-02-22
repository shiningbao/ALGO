package ex04;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // 1. n 을 문자로 만든다.
        String num = String.valueOf(n);
        // 2. 문자를 한자리씩 끊는다.
        String[] arr = num.split("");
        // 3. 하나식 끊어진 문자를 다시 숫자로 변환
        for (String a : arr) {
        	// 4. 바뀐 숫자들을 더한다.
			answer += Integer.parseInt(a);
		}      
        
        /*
        for (String a :String.valueOf(n).split("")) {
        	answer += Integer.parseInt(a);
        }
        */
        return answer;
    }
}
