package ex10;

import java.util.Arrays;

// 최댓값 만들기(1)
public class Solution {

	public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        // System.out.println(Arrays.toString(numbers));
        answer = numbers[numbers.length-1]*numbers[numbers.length-2];
        return answer;
    }
}
