package ex30;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main { /* 캐시
지도개발팀에서 근무하는 제이지는 지도에서 도시 이름을 검색하면 해당 도시와 관련된 맛집 게시물들을 데이터베이스에서 읽어 보여주는 서비스를 개발하고 있다.
이 프로그램의 테스팅 업무를 담당하고 있는 어피치는 서비스를 오픈하기 전 각 로직에 대한 성능 측정을 수행하였는데, 
제이지가 작성한 부분 중 데이터베이스에서 게시물을 가져오는 부분의 실행시간이 너무 오래 걸린다는 것을 알게 되었다.
어피치는 제이지에게 해당 로직을 개선하라고 닦달하기 시작하였고, 제이지는 DB 캐시를 적용하여 성능 개선을 시도하고 있지만 캐시 크기를 얼마로 해야 효율적인지 몰라 난감한 상황이다.

어피치에게 시달리는 제이지를 도와, DB 캐시를 적용할 때 캐시 크기에 따른 실행시간 측정 프로그램을 작성하시오.

조건
캐시 교체 알고리즘은 LRU(Least Recently Used)를 사용한다.
cache hit일 경우 실행시간은 1이다.
cache miss일 경우 실행시간은 5이다.
*/

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
	
		
		// result = sol.solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"});
		// System.out.println("50=="+result);
		
		result = sol.solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "Pangyo", "jeju", "Seoul", "Jeju", "Pangyo", "Seoul"}); 
		System.out.println("21=="+result);
		
		result = sol.solution(2, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}); 
		System.out.println("60=="+result);
		
		result = sol.solution(5, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}); 
		System.out.println("52=="+result);
		
		result = sol.solution(2, new String[] {"Jeju", "Pangyo", "NewYork", "newyork"}); 
		System.out.println("16=="+result);
		
		result = sol.solution(0, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"}); 
		System.out.println("25=="+result);
		
		result = sol.solution(3, new String[] {"Jeju","la","pangyo", "PANGYO"}); 
		System.out.println("16=="+result);
	}	
}

class Solution {
    public int solution(int cacheSize, String[] cities) { // 0.03ms ~ 59.46ms
        int answer = 0;
        Queue<String> cache = new ArrayDeque<>();
        
        for (int i = 0; i < cities.length; i++) {
        	if(cacheSize != 0) {       		
        		if(cache.contains(cities[i].toLowerCase())) {
        			answer += 1;
        			cache.remove(cities[i].toLowerCase());
        		} else {
        			answer += 5;
        		}		        		        		
        		cache.add(cities[i].toLowerCase());        		
			
				if(cache.size() > cacheSize) {	
					cache.poll();
				} 	
				
        	} else {
        		return 5*cities.length;
        	}
			
		}
        return answer;
    }
}