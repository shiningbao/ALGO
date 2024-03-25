package ex59;

import java.math.BigInteger;

/* 두 수의 합
	0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution("582", "734"); 
		System.out.println("1316=="+result); 
		
		result = sol.solution("18446744073709551615", "287346502836570928366"); 
		System.out.println("305793246910280479981=="+result); 
		
		result = sol.solution("0", "0"); 
		System.out.println("0=="+result); 
	}
}

class Solution {
    public String solution(String a, String b) { // 1.06ms ~ 472.73ms
    	 BigInteger q = new BigInteger(a);
         BigInteger w = new BigInteger(b);
         BigInteger answer = q.add(w);
         return answer.toString();
    }
}