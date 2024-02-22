package ex015;

public class Solution {
	
	public long solution(long n) {
        long answer = 0;
        
        // n 은 제곱근이 맞는지?
        int root = (int) Math.sqrt(n);
        // n 의 제곱근을 제곱 == n
        Math.pow(root, 2);
        // System.out.println(n+"의 제곱근 :"+root+"/ 제곱 :"+Math.pow(root,2));
		
        answer =  (long) (Math.pow(root, 2)==n? Math.pow(root+1, 2) : -1);
        return answer;
	        
	    }
    }

