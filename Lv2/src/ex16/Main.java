package ex16;

import java.util.ArrayDeque;
import java.util.Queue;

// 다리를 지나는 트럭

public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
	
		result = sol.solution(2, 10, new int[] {7, 4, 5, 6}); 
		System.out.println("8=="+result);
		
		result = sol.solution(100, 100, new int[] {10}); 
		System.out.println("101=="+result);
		
		result = sol.solution(100, 100, new int[] {10, 10, 10, 10, 10, 10, 10, 10, 10, 10}); 
		System.out.println("110=="+result);
	}
	
}

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) { // 0.04ms ~ 19.54ms
    	 int answer = 0;
         Queue<Integer> bridge = new ArrayDeque<>();
         int total = 0; // 다리 위 트럭 무게
         
         for (int truck : truck_weights) {
        	 
 			while (true) {
 				if(bridge.isEmpty()) { // 다리가 비었을 때
 					bridge.add(truck);
 					total += truck;
 					answer ++;
 					break;
 				} else if(bridge.size() == bridge_length) { // 다리가 꽉 찼을 때
 					total -= bridge.poll();
 				} else {
 					if(total + truck <= weight) {
 						bridge.add(truck);
 						total += truck;
 						answer++;
 						break;
 					} else {
 						bridge.add(0);
 						answer ++;
 					}
 				}
 			}
 			
 		}
         
         return answer + bridge_length;
    }
}