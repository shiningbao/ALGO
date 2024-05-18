package ex14;

import java.util.Arrays;

/* 	x만큼 간격이 있는 n개의 숫자
	함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
	다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		long[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(2, 5); 
		System.out.println("[2,4,6,8,10]=="+Arrays.toString(result)); 
		
		result = sol.solution(4, 3); 
		System.out.println("[4,8,12]=="+Arrays.toString(result)); 
		
		result = sol.solution(-4, 2); 
		System.out.println("[-4, -8]=="+Arrays.toString(result)); 
		
		result = sol.solution(10000000, 1000); 
		System.out.println("[길이가 1000이고 10000000씩 증가하는 배열]=="+Arrays.toString(result)); 		
	}
}

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for (int i = 0; i < n; i++) {
			answer[i] = (long)x*(i+1); // 처음에 그냥 answer[i] = x*(i+1); 로 했는데 틀려서 뭐지? 하고 네번째 케이스를 추가 해보니 형변환을 해줘야 했음!!
		}        
        return answer;
    }
}