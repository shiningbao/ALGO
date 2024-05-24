package ex04;

import java.util.Arrays;

/* 	JadenCase 문자열 만들기
	JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 
	단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
	문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
	
	제한 조건
	s는 길이 1 이상 200 이하인 문자열입니다.
	s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
	숫자는 단어의 첫 문자로만 나옵니다.
	숫자로만 이루어진 단어는 없습니다.
	공백문자가 연속해서 나올 수 있습니다.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
	
		result = sol.solution("3people unFollowed me"); 
		System.out.println("3people Unfollowed Me=="+result);
		
		result = sol.solution("for the last week"); 
		System.out.println("For The Last Week=="+result);
		
		result = sol.solution(" a b "); 
		System.out.println(" A B =="+result);
	}
	
}

class Solution {
    public String solution(String s) { // 6.2ms ~ 10.35ms
        /*StringBuilder answer = new StringBuilder();
        String small = "";
        
        for (int i = 0; i < s.length(); i++) {
			small += (s.charAt(i)+"").toLowerCase();
		}
        
        String[] smallArr = small.split("");
        
        for (int i = 0; i < smallArr.length; i++) {
			if(smallArr[i].equals(" ") && smallArr.length != 1) {
				if(i != smallArr.length-1) {
				smallArr[i+1] = smallArr[i+1].toUpperCase(); 
				}
			}
			smallArr[0] = smallArr[0].toUpperCase();
			answer.append(smallArr[i]);
		}
        
        return answer.toString();*/
        
        // 1.35ms ~ 2.40ms
	        String answer = "";
	        String[] sp = s.toLowerCase().split("");
	        boolean flag = true;
	
	        for(String ss : sp) {
	            answer += flag ? ss.toUpperCase() : ss;
	            System.out.println(flag);
	            flag = ss.equals(" ") ? true : false;
	        }
	
	        return answer;
         
    }
}