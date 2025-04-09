package ex42;

import java.util.HashMap;

// 완주하지 못한 선수

public class Main { 

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
	
		result = sol.solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}); 
		System.out.println("leo=="+result);
		
		result = sol.solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, new String[] {"josipa", "filipa", "marina", "nikola"}); 
		System.out.println("vinko=="+result);
		
		result = sol.solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"}); 
		System.out.println("mislav=="+result);
	}
	
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String player : participant) { 
			map.put(player, map.getOrDefault(player, 0)+1); // getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환
		}
        
        for (String player : completion) {
			map.put(player, map.get(player)-1); 
		}
        
        for (String key : map.keySet()) {
			if(map.get(key) != 0) {
				answer = key;
			}
		}
        
        return answer;
    }
}