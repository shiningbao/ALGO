package ex42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*	등수 매기기
	영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 
	영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}}); 
		System.out.println("[1, 2, 4, 3]=="+Arrays.toString(result)); 
		
		result = sol.solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}}); 
		System.out.println("[4, 4, 6, 2, 2, 1, 7]=="+Arrays.toString(result)); 
	}
}

class Solution {
    public int[] solution(int[][] score) { // 0.33ms ~ 1.09ms
    	  List<Integer> sumList = new ArrayList<>();
          for(int[] t : score){
        	  sumList.add(t[0] + t[1]);
          }
          sumList.sort(Comparator.reverseOrder());

          int[] answer = new int[score.length];
          for(int i=0; i<score.length; i++){
              answer[i] = sumList.indexOf(score[i][0] + score[i][1])+1;
          }
          return answer;
    }
}