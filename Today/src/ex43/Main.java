package ex43;

/*	문자열이 몇 번 등장하는지 세기
	문자열 myString과 pat이 주어집니다. myString에서 pat이 등장하는 횟수를 return 하는 solution 함수를 완성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution("banana", "ana");
		System.out.println("2=="+result); 
		
		result = sol.solution("aaaa", "aa");
		System.out.println("3=="+result); 
	}
}

class Solution {
    public int solution(String myString, String pat) { // 0.02ms ~ 0.19ms
        int answer = 0;       
        
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            if (myString.substring(i, i + pat.length()).equals(pat)) {
                answer++;
            }
        }
        
        /* 0.04ms ~ 0.49ms
         	for(int i=0; i<myString.length(); i++) {
	            if(myString.substring(i).startsWith(pat)){
	                answer++;
	            }
        }
         */
       
        return answer;
    }
}