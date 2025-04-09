package ex21;

import java.util.Arrays;

public class Main { /* 구명보트
무인도에 갇힌 사람들을 구명보트를 이용하여 구출하려고 합니다. 구명보트는 작아서 한 번에 최대 2명씩 밖에 탈 수 없고, 무게 제한도 있습니다.

예를 들어, 사람들의 몸무게가 [70kg, 50kg, 80kg, 50kg]이고 
구명보트의 무게 제한이 100kg이라면 2번째 사람과 4번째 사람은 같이 탈 수 있지만 
1번째 사람과 3번째 사람의 무게의 합은 150kg이므로 구명보트의 무게 제한을 초과하여 같이 탈 수 없습니다.
구명보트를 최대한 적게 사용하여 모든 사람을 구출하려고 합니다.
사람들의 몸무게를 담은 배열 people과 구명보트의 무게 제한 limit가 매개변수로 주어질 때, 
모든 사람을 구출하기 위해 필요한 구명보트 개수의 최솟값을 return 하도록 solution 함수를 작성해주세요. */

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
	
		result = sol.solution(new int[] {70, 50, 80, 50}, 100); 
		System.out.println("3=="+result);
		
		result = sol.solution(new int[] {70, 80, 50}, 100); 
		System.out.println("3=="+result);
		
		result = sol.solution(new int[] {30}, 40); 
		System.out.println("1=="+result);
	}
	
}

class Solution {
    public int solution(int[] people, int limit) {   
    	/*
        int answer = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for (Integer weight : people) {
			q.add(weight);
		}
        
        while(!q.isEmpty()) {
        	int lowest = q.poll();
        	
        	if(!q.isEmpty() && lowest + q.peek() <= limit) {
        		q.poll();
        	}
        	
        	answer++;
        }
        */

    	Arrays.sort(people); // 몸무게를 오름차순으로 정렬
        int light = 0; // 가장 가벼운 사람
        int heavy = people.length - 1; // 가장 무거운 사람
        int answer = 0; // 필요한 보트의 개수

        while (light <= heavy) {
            // 가장 가벼운 사람과 가장 무거운 사람의 합이 limit 이하라면 둘 다 태움
            if (people[light] + people[heavy] <= limit) {
                light++; // 가벼운 사람 태우기
            }
            // 무거운 사람은 항상 태움 (둘 다 못 태울 경우에도 무거운 사람 우선)
            heavy--; 
            answer++; // 보트 하나 추가
        } 
		   
        return answer;
    }
}