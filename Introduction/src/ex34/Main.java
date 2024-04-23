package ex34;

/*	구슬을 나누는 경우의 수
	머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다. 
	머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때, balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(3, 2); 
		System.out.println("3=="+result); 
		
		result = sol.solution(5, 3); 
		System.out.println("10=="+result); 

	}
}

class Solution {
    public int solution(int balls, int share) { // 0.01ms ~ 0.03ms
    	long answer = 1;
        int shareIdx = 1;
        
        for(int i = share+1; i <= balls; i++){
            answer *= i;
            answer /= shareIdx;
            shareIdx++;
        }
        
        return (int)answer;
    }
}