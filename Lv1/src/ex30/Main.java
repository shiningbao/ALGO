package ex30;

/* 크기가 작은 부분문자열
	숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서, 
	이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.

	예를 들어, t="3141592"이고 p="271" 인 경우, t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다. 
	이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.
*/
public class Main { 

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
	
		result = sol.solution("3141592", "271"); 
		System.out.println("2=="+result);
		
		result = sol.solution("500220839878", "7"); 
		System.out.println("8=="+result);
		
		result = sol.solution("10203", "15"); 
		System.out.println("3=="+result);
	}
	
}

class Solution {
    public int solution(String t, String p) { // 0.05ms ~ 6.49ms
    	// p의 길이 구하고 t에서 p의 길이만큼 잘라 그게 int p 보다 작거나 같은게 answer
        int answer = 0;
        int pLength = p.length();
        
        for (int i = 0; i < t.length(); i++) { 
        	if(pLength <= t.length()) {
				String str = t.substring(i, pLength);
				pLength++;				
				if(Long.parseLong(str) <= Long.parseLong(p)) { // p의 길이가 18까지라서 int 범위를 벗어나서 Integer.parseInt로 했다가 계속 틀림...
					answer++;
				}
        	}
		}
        
        return answer;
    }
}