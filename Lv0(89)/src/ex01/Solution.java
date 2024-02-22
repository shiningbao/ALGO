package ex01;

import java.util.Arrays;
// 삼각형의 완성조건
public class Solution {
	public int solution(int[] sides) {
        int answer = 0;
        // 정렬
        Arrays.sort(sides);
        answer = sides[0]+sides[1]>sides[2]?1:2;
        return answer;
    }
}
