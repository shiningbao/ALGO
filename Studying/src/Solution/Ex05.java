package Solution;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex05 { // 모의고사
	/* 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
		1번 수포자가 찍는 방식 : 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
		2번 수포자가 찍는 방식 : 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
		3번 수포자가 찍는 방식 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
		1번 문제부터 마지막 문제까지의 정답이 순서대로 저장된 배열 answers가 주어졌을 때 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 반환하도록 solution() 함수를 작성하세요.
		제약 조건
		시험은 10,000 문제로 구성
		문제의 정답은 1, 2, 3, 4, 5 중 하나
		가장 높은 점수를 받은 사람이 여럿이라면 반환하는 값을 오름차순으로 정렬
	*/

	public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2})));
    }

    private static int[] solution(int[] answers) {
    int[][] pattern = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
    int[] scores = new int[3];
    
    for (int i = 0; i < answers.length; i++) {
		for (int j = 0; j < pattern.length; j++) {
			if(answers[i] == pattern[j][i % pattern[j].length]) {
				scores[j]++;
			}
		}
	}
    // 가장 높은 점수 저장
    int maxScore = Arrays.stream(scores).max().getAsInt();
    // 가장 높은 점수를 가진 수포자들의 번호를 찾아서 리스트에 담기
    ArrayList<Integer> answer = new ArrayList<>();
    for (int i = 0; i < scores.length; i++) {
		if(scores[i] == maxScore) {
			answer.add(i+1);
		}
	}
    	
    return answer.stream().mapToInt(Integer::intValue).toArray();
    }


}
