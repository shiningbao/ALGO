package ex56;

import java.util.ArrayList;
import java.util.Arrays;

/* 배열 만들기4
	정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk를 만드려고 합니다.
	
	변수 i를 만들어 초기값을 0으로 설정한 후 i가 arr의 길이보다 작으면 다음 작업을 반복합니다.
	
	만약 stk가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
	stk에 원소가 있고, stk의 마지막 원소가 arr[i]보다 작으면 arr[i]를 stk의 뒤에 추가하고 i에 1을 더합니다.
	stk에 원소가 있는데 stk의 마지막 원소가 arr[i]보다 크거나 같으면 stk의 마지막 원소를 stk에서 제거합니다.
	위 작업을 마친 후 만들어진 stk를 return 하는 solution 함수를 완성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[]{1, 4, 2, 5, 3}); 
		System.out.println("[1,2,3]=="+Arrays.toString(result)); 

	}
}

class Solution {
    public int[] solution(int[] arr) { // 3.93ms ~ 26.54ms
    	ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) { // 배열의 끝까지 반복
            if (list.isEmpty()) {
                list.add(arr[i]);
                i++;
            } else if (list.get(list.size() - 1) < arr[i]) {
                list.add(arr[i]);
                i++;
            } else if (list.get(list.size() - 1) >= arr[i]) {
                list.remove(list.size() - 1);
            }
        }

        int[] stk = new int[list.size()];

        for (int j = 0; j < stk.length; j++) {
            stk[j] = list.get(j);
        }
        return stk;
    }
}