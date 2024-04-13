package ex20;

import java.util.Arrays;

/*	A로 B 만들기
	문자열 before와 after가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution("olleh", "hello"); 
		System.out.println("1=="+result); 
		
		result = sol.solution("allpe", "apple"); 
		System.out.println("0=="+result); 
	}
}

class Solution {
    public int solution(String before, String after) { // 0.38ms ~ 12.85ms
    	char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();

        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);

        if (Arrays.equals(beforeArr, afterArr)) {
            return 1;
        } else {
            return 0;
        }
    }
}