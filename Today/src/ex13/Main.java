package ex13;

import java.util.ArrayList;
import java.util.Arrays;

/*	x 사이의 갯수
  	문자열 myString이 주어집니다. 
  	myString을 문자 "x"를 기준으로 나눴을 때 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		result = sol.solution("oxooxoxxox");
		System.out.println("[1, 2, 1, 0, 1, 0]=="+Arrays.toString(result)); 		
	}

}

class Solution {
    public int[] solution(String myString) {
    	ArrayList<Integer> lengths = new ArrayList<>();
        int count = 0;
        
        // 이전 "x"의 위치를 저장
        int prev= -1;

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                // 현재 "x"의 위치에서 이전 "x"의 위치를 빼서 부분문자열의 길이를 계산하고 저장
                lengths.add(i - prev - 1);
                // 이전 "x"의 위치 갱신
                prev = i;
                count++;
            }
        }

        // 마지막 "x" 이후에 남은 부분의 길이 저장
        if (count > 0) {
            lengths.add(myString.length() - prev - 1);
        }

        // ArrayList를 int 배열로 변환하여 반환
        int[] result = new int[lengths.size()];
        for (int i = 0; i < lengths.size(); i++) {
            result[i] = lengths.get(i);
        }
        return result;
    }
}