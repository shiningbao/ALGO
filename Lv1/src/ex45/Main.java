package ex45;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
/*	모의고사
	수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
	1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
	2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
	3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
	1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
*/

public class Main { 

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
	
		result = sol.solution(new int[] {1, 2, 3, 4, 5}); 
		System.out.println("[1]=="+Arrays.toString(result));
		
		result = sol.solution(new int[] {1, 3, 2, 4, 2}); 
		System.out.println("[1, 2, 3]=="+Arrays.toString(result));
	}
	
}

class Solution {
    public int[] solution(int[] answers) { // 0.04ms ~ 0.69ms
    	ArrayList<Integer> list = new ArrayList<>();
        
        int[] no1 = {1, 2, 3, 4, 5};
        int[] no2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] no3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] scores = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == no1[i % no1.length]) 
            	scores[0]++;
            if (answers[i] == no2[i % no2.length]) 
            	scores[1]++;
            if (answers[i] == no3[i % no3.length]) 
            	scores[2]++;
        }

        int maxScore = Math.max(scores[0], Math.max(scores[1], scores[2]));
        
        for (int i = 0; i < scores.length; i++) {
			if(scores[i] == maxScore)
				list.add(i+1);
		}
        
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

        return answer;
    }
}