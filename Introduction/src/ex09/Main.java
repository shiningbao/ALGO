package ex09;

import java.util.Arrays;

/*	문자열 정렬하기(2)
	영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution("Bcad"); 
		System.out.println("abcd=="+result); 
		
		result = sol.solution("heLLo"); 
		System.out.println("ehllo=="+result); 
		
		result = sol.solution("Python"); 
		System.out.println("hnopty=="+result); 
	}
}

class Solution {
    public String solution(String my_string) { // 1.59ms ~ 2.69ms
        String answer = "";

        String[] arr = my_string.toLowerCase().split("");
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
       
        return answer;
    }
}