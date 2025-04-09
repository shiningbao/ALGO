package ex12;

import java.util.HashMap;

// 의상

public class Main {

	public static void main(String[] args) {
		int result = 1;
		Solution sol = new Solution();
	
		result = sol.solution(new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}); 
		System.out.println("5=="+result);
		
		result = sol.solution(new String[][] {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}); 
		System.out.println("3=="+result);
	}
	
}

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String[] cloth : clothes) {
			String type = cloth[1];
			map.put(type, map.getOrDefault(type, 0)+1);
		}
        
        for (int count : map.values()) {
			answer *= (count+1);
		}
        
        return answer-1; // 최소한 한 가지는 입는다고 했으므로 아무것도 착용하지 않을 경우를 빼줘야함
    }
}