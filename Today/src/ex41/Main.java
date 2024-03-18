package ex41;

import java.util.ArrayList;
import java.util.Arrays;

/*	빈 배열에 추가, 삭제하기
	아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 길이가 같은 정수 배열 arr과 boolean 배열 flag가 매개변수로 주어질 때, 
	flag를 차례대로 순회하며 flag[i]가 true라면 X의 뒤에 arr[i]를 arr[i] × 2 번 추가하고, 
	flag[i]가 false라면 X에서 마지막 arr[i]개의 원소를 제거한 뒤 X를 return 하는 solution 함수를 작성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {3, 2, 4, 1, 3}, new boolean[] {true, false, true, false, false});
		System.out.println("[3, 3, 3, 3, 4, 4, 4, 4]=="+Arrays.toString(result)); 
	}
}

class Solution {
    public int[] solution(int[] arr, boolean[] flag) { // 0.03ms ~ 0.55ms
    	ArrayList<Integer> X = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    X.add(arr[i]);
                }
            } else {
                if (X.size() >= arr[i]) {
                    for (int j = 0; j < arr[i]; j++) {
                        X.remove(X.size() - 1);
                    }
                }
            }
        }

        int[] answer = new int[X.size()];
        for (int i = 0; i < X.size(); i++) {
            answer[i] = X.get(i);
        }

        return answer;
    }
}