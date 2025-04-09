package ex23;

import java.util.Arrays;

public class Main { /* N개의 최소공배수
두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 
예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다. 
n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요. */
	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
	
		result = sol.solution(new int[] {2, 6, 8, 14}); 
		System.out.println("168=="+result);
		
		result = sol.solution(new int[] {1, 2, 3}); 
		System.out.println("6=="+result);
		
		result = sol.solution(new int[] {4, 16, 8}); 
		System.out.println("16=="+result);
	}	
}

class Solution { // 0.03ms ~ 5.77ms
    public int solution(int[] arr) {
        int max = arr[arr.length -1];
        int answer = max;
       
        while (true) {
            boolean isLCM = true;

            // 모든 숫자가 최소공배수의 약수인지 확인
            for (int num : arr) {
                if (answer % num != 0) {
                    isLCM = false;
                    break;
                }
            }

            // 조건 만족 시 최소공배수 반환
            if (isLCM) {
                return answer;
            }

            // 조건을 만족하지 않으면 최소공배수 증가
            answer += max;
        }

    }
}