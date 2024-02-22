package ex07;
// 짝수 홀수 개수
public class Solution {

	public int[] solution(int[] num_list) {
	
        int[] answer = new int[]{0,0};
        for (int n : num_list) {
			if(n%2==0) {
				answer[0]++;
			}else {
				answer[1]++;
			}
		}
        return answer;
    }
}
