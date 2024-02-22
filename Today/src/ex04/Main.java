package ex04;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String result = "";
		result = sol.solution("cccCCC");
		System.out.println("CCCccc=="+result);
		
		result = sol.solution("abCdEfghIJ");
		System.out.println("ABcDeFGHij=="+result);

	}
}
class Solution {
	 public String solution(String my_string) {
	        String answer = "";
	        
	        char[] arr = my_string.toCharArray();
	        for (int i = 0; i < arr.length; i++) {
				if(arr[i]>=65&&arr[i]<=90) {
					answer += (char)(arr[i]+32);
				}else {
					answer += (char)(arr[i]-32);
				}
			}
	       
			
	        return answer;
	    }
}
