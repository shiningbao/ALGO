package ex11;

import java.util.HashSet;

// 전화번호 목록

public class Main {

	public static void main(String[] args) {
		boolean result = true;
		Solution sol = new Solution();
	
		result = sol.solution(new String[] {"119", "97674223", "1195524421"}); 
		System.out.println("false=="+result);
		
		result = sol.solution(new String[] {"123", "456", "789"}); 
		System.out.println("true=="+result);
		
		result = sol.solution(new String[] {"12", "123", "1235", "567", "88"}); 
		System.out.println("false=="+result);

	}
	
}

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> set = new HashSet<>();
        
        for (String tel : phone_book) {
			set.add(tel);
		}
        
        for (String tel : phone_book) {
			for (int i = 1; i < tel.length(); i++) {
				if(set.contains(tel.substring(0,i))) {
					answer = false;
				}
			}
		}
        
        return answer;
    }
}