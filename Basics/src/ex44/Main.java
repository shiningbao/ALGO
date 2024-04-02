package ex44;

/*	1로 만들기
	정수가 있을 때, 짝수라면 반으로 나누고, 홀수라면 1을 뺀 뒤 반으로 나누면, 마지막엔 1이 됩니다. 예를 들어 10이 있다면 다음과 같은 과정으로 1이 됩니다.
	10 / 2 = 5
	(5 - 1) / 2 = 2
	2 / 2 = 1
	위와 같이 3번의 나누기 연산으로 1이 되었습니다.
	정수들이 담긴 리스트 num_list가 주어질 때, num_list의 모든 원소를 1로 만들기 위해서 필요한 나누기 연산의 횟수를 return하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {12, 4, 15, 1, 14}); // 6 3 1, 2 1, 7 3 1, 1일때는 안하고, 7 3 1 -> 11번 
		System.out.println("11=="+result); 
	}
}

class Solution {
    public int solution(int[] num_list) { // 0.01ms ~ 0.04ms
        int answer = 0;
        
        for (int i : num_list) {
            while (i != 1) {
                if (i % 2 == 0) {
                    i /= 2;
                } else {
                    i = (i - 1) / 2;
                }
                answer++;
            }
        }
        
        return answer;
    }
}