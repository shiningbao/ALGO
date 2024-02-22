package ex57;

// A 강조하기
public class Solution {

	 public String solution(String myString) {
	        String answer = "";
	       
	        answer = myString.toLowerCase().replaceAll("a", "A");
	        
	        return answer;
	    }
}
