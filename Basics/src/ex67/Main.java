package ex67;

import java.util.Arrays;

/* 전국 대회 선발 고사
	0번부터 n - 1번까지 n명의 학생 중 3명을 선발하는 전국 대회 선발 고사를 보았습니다. 등수가 높은 3명을 선발해야 하지만, 
	개인 사정으로 전국 대회에 참여하지 못하는 학생들이 있어 참여가 가능한 학생 중 등수가 높은 3명을 선발하기로 했습니다.
	각 학생들의 선발 고사 등수를 담은 정수 배열 rank와 전국 대회 참여 가능 여부가 담긴 boolean 배열 attendance가 매개변수로 주어집니다. 
	전국 대회에 선발된 학생 번호들을 등수가 높은 순서대로 각각 a, b, c번이라고 할 때 10000 × a + 100 × b + c를 return 하는 solution 함수를 작성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {3,7,2,5,4,6,1}, new boolean[] {false, true, true, true, true, false, false}); 
		System.out.println("20403=="+result); 
		
		result = sol.solution(new int[] {1,2,3}, new boolean[] {true, true, true}); 
		System.out.println("102=="+result); 
		
		result = sol.solution(new int[] {6,1,5,2,3,4}, new boolean[] {true, false, true, false, false, true}); 
		System.out.println("50200=="+result); 
	}
}

class Solution {
    public int solution(int[] rank, boolean[] attendance) { // 0.32ms ~ 2.32ms
    	int answer = 0;
		int sort[] = new int[rank.length];
		for (int i = 0; i < rank.length; i++) {
			if (attendance[i]) {
				sort[i] = rank[i];
			} else {
				rank[i] = Integer.MAX_VALUE;
			}
		}
		Arrays.sort(rank);

		for (int i = 0; i < sort.length; i++) {
			if (rank[0] == sort[i]) {
				answer += i * 10000;
			} else if (rank[1] == sort[i]) {
				answer += i*100;
			} else if (rank[2] == sort[i]) {
				answer += i;
			}
		}

		return answer;
    }
}