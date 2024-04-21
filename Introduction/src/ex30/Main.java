package ex30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*	잘라서 배열로 저장하기
	문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		String[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution("abc1Addfggg4556b", 6); 
		System.out.println("[\"abc1Ad\", \"dfggg4\", \"556b\"]=="+Arrays.toString(result)); 

		result = sol.solution("abcdef123", 3); 
		System.out.println("[\"abc\", \"def\", \"123\"]=="+Arrays.toString(result)); 
	}
}

class Solution {
    public String[] solution(String my_str, int n) { // 0.02ms ~ 0.06ms
    	List<String> list = new ArrayList<>();
    	
    	for (int i = 0; i < my_str.length(); i+=n) {
    		if(i+n <= my_str.length()) {
			list.add(my_str.substring(i, i+n));
    		}else {
    			list.add(my_str.substring(i,my_str.length()));
    		}
		}
    	
        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
       
        return answer;
    }
}