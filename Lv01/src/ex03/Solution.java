package ex03;

public class Solution {
	
    public String solution(int num) {
        //String answer = "";
        // num 이 홀수인지 짝수인지 어떻게 구분?
    	// 홀수 짝수에 따라서 어떻게 "Odd" "Even" 을 반환 할 것인가?
    	/*
        if(num%2==0) {
        	return "Even";
        }else {
        	return "Odd";
        }
        */
    	return num%2==0 ? "Even":"Odd";
        
        
        //return answer;
    }

}
