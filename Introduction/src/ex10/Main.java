package ex10;

/*	숫자 찾기
	정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(29183, 1); 
		System.out.println("3=="+result); 
		
		result = sol.solution(232443, 4); 
		System.out.println("4=="+result); 
		
		result = sol.solution(123456, 7); 
		System.out.println("-1 =="+result); 
	}
}

class Solution {
    public int solution(int num, int k) { // 0.03ms ~ 0.05ms
        int answer = -1;
        
        String str = Integer.toString(num);
        if(str.contains(Integer.toString(k))) {
        	answer = str.indexOf(Integer.toString(k))+1;
        }
        
        return answer;
    }
}