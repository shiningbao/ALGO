package ex38;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* 두 개 뽑아서 더하기
	정수 배열 numbers가 주어집니다. 
	numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
*/
public class Main { 

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
	
		result = sol.solution(new int[] {2, 1, 3, 4, 1}); 
		System.out.println("[2, 3, 4, 5, 6, 7]=="+Arrays.toString(result));
		
		result = sol.solution(new int[] {5, 0, 2, 7}); 
		System.out.println("[2, 5, 7, 9, 12]=="+Arrays.toString(result));
	}
	
}

class Solution {
    public int[] solution(int[] numbers) { // 0.93ms ~ 3.87ms
        Set<Integer> set = new TreeSet<>(); // Treeset -> 중복x, 오름차순 정렬
        
        for (int i = 0; i < numbers.length; i++) {
        	for (int j = i+1; j < numbers.length; j++) {
				set.add(numbers[i]+numbers[j]);
			}
		}
        Iterator iter = set.iterator();
        
        int[] answer = new int[set.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = (int)iter.next();
		}
   
        return answer;
    }
}