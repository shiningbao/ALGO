package ex12;

/*	369게임
	머쓱이는 친구들과 369게임을 하고 있습니다. 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다. 
	머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(3); 
		System.out.println("1=="+result); 
		
		result = sol.solution(29423); 
		System.out.println("2=="+result); 
	}
}

class Solution {
    public int solution(int order) { // 0.11ms ~ 0.19ms
        int answer = 0;
        
        for (String str : Integer.toString(order).split("")) {
			if(str.contains("3")||str.contains("6")||str.contains("9")) {
				answer++;
			}
		}
        
        return answer;
    }
}