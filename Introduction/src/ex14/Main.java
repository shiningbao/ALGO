package ex14;

import java.util.LinkedHashSet;
import java.util.Set;

/*	중복된 문자 제거
	문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution("people"); 
		System.out.println("peol=="+result); 
		
		result = sol.solution("We are the world"); 
		System.out.println("We arthwold=="+result); 
	}
}

class Solution {
    public String solution(String my_string) { // 0.43ms ~ 0.68ms
    	 Set<Character> set = new LinkedHashSet<>(); // LinkedHashSet : 중복을 허용하지 않으면서 데이터가 입력된 순서대로 데이터를 저장
         
         for (char c : my_string.toCharArray()) {
        	 set.add(c);
         }
         
         StringBuilder answer = new StringBuilder();
         for (char c : set) {
        	 answer.append(c);
         }
         
         return answer.toString();
    }
}