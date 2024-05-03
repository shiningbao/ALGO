package ex46;

/* 	문자열 밀기
	문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다. 
	이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, 
	A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution("hello", "ohell"); 
		System.out.println("1=="+result); 
		
		result = sol.solution("apple", "elppa"); 
		System.out.println("-1=="+result); 
		
		result = sol.solution("atat", "tata"); 
		System.out.println("1=="+result); 
	}
}

class Solution {
    public int solution(String A, String B) { // 0.02ms ~ 2.44ms
        int answer = 0;
        
        String str = A;
        for (int i = 0; i < A.length(); i++) {
			if(str.equals(B)) {
				return answer;
			}
			String a = str.substring(str.length()-1);
			str = a+str.substring(0, str.length()-1);
			answer += 1;
		}
        
        return -1;
        
        /* 1.13ms ~ 1.59ms
        	return (B+B).indexOf(A);
         */
    }
}