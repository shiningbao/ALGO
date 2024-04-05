package ex07;

import java.util.ArrayList;
import java.util.Arrays;

/*	약수 구하기
	정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(24); 
		System.out.println("[1, 2, 3, 4, 6, 8, 12, 24]=="+Arrays.toString(result)); 
		
		result = sol.solution(29); 
		System.out.println("[1, 29]=="+Arrays.toString(result)); 
	}
}

class Solution {
    public int[] solution(int n) { // 0.02ms ~ 0.26ms
    	ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}