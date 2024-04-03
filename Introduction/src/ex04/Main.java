package ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*	문자열 정렬하기(1)
	문자열 my_string이 매개변수로 주어질 때, my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution("hi12392"); 
		System.out.println("[1, 2, 2, 3, 9]=="+Arrays.toString(result)); 
		
		result = sol.solution("p2o4i8gj2"); 
		System.out.println("[2, 2, 4, 8]=="+Arrays.toString(result)); 		
		
		result = sol.solution("abcde0"); 
		System.out.println("[0]=="+Arrays.toString(result)); 	
	}
}

class Solution {
    public int[] solution(String my_string) { // 0.38ms ~ 2.93ms
    	List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
			if(my_string.charAt(i)>='0' && my_string.charAt(i)<='9') {
				list.add(my_string.charAt(i) - '0');
			}
		}
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        Arrays.sort(answer);
        
        return answer;
    }
}