package ex32;

/*	등차수열의 특정한 항만 더하기
	두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 
	첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때, 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(3,4, new boolean[] {true, false, false, true, true});
		System.out.println("37=="+result);
		
		result = sol.solution(7,1, new boolean[] {false, false, false, true, false, false, false});
		System.out.println("10=="+result); 
	}
}

class Solution {
    public int solution(int a, int d, boolean[] included) { // 0.01ms ~ 0.05ms
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i]) {
                answer += a + (i * d);
            }
        }
        return answer;
    }
}
