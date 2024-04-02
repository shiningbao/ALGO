package ex08;

import java.util.Arrays;

// 뒤에서 5등까지
// 정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		result = sol.solution(new int[]{12,4,15,46,38,1,14});
		System.out.println(Arrays.toString(result)); 		
	}

}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list); // 오름차순 정렬
        // Arrays.sort(num_list, Collections.reverseOrder()); 내림차순 정렬
        
        for (int i = 0; i <5; i++) {
			answer[i] = num_list[i];
		}
        return answer;
    }
}
