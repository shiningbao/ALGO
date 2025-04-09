package ex18;

import java.util.Arrays;

/* 가장 큰 수
	0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
	예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
	0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
*/

public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
	
		result = sol.solution(new int[] {6, 10, 2}); 
		System.out.println("6210=="+result);
		
		result = sol.solution(new int[] {3, 30, 34, 5, 9}); 
		System.out.println("9534330=="+result);
	}
	
}

class Solution {
    public String solution(int[] numbers) { // 1.54ms ~ 231.41ms
    	StringBuilder answer = new StringBuilder();
        String[] strArr = new String[numbers.length];
        
        for (int i = 0; i < strArr.length; i++) {
			strArr[i] = Integer.toString(numbers[i]);
		}
        
        Arrays.sort(strArr, (x, y) -> (y + x).compareTo(x + y)); // xy, yx 중 뭐가 더 큰지 비교
        
        for (String str : strArr) {
            answer.append(str);
        }

        if (answer.charAt(0) == '0') {
            return "0";
        }

        return answer.toString();
    }
}