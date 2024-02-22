package ex02;
// 배열 원소의 길이
public class Solution {
	
	 public int[] solution(String[] strlist) {
	        int[] answer = new int[strlist.length]; // 배열의 크기 지정
	        
	        for (int i = 0; i < strlist.length; i++) {
				answer[i] = strlist[i].length();
			}
	        
	     return answer;
	    }
}
