package ex70;

import java.util.Arrays;

/* 배열 조각하기
	정수 배열 arr와 query가 주어집니다.

	query를 순회하면서 다음 작업을 반복합니다.
	
	짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
	홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
	위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 solution 함수를 완성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[]{0, 1, 2, 3, 4, 5}, new int[] {4, 1, 2}); 
		System.out.println("[1, 2, 3]=="+Arrays.toString(result)); 
		
	}
}

class Solution {
    public int[] solution(int[] arr, int[] query) { // 0.07ms ~ 0.93ms
    	for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            } else {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }
}