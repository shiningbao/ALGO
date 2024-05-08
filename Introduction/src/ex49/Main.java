package ex49;

/* 	최빈값 구하기
	최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 
	정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {1, 2, 3, 3, 3, 4}); 
		System.out.println("3=="+result); 
		
		result = sol.solution(new int[] {1, 1, 2, 2}); 
		System.out.println("-1=="+result);
		
		result = sol.solution(new int[] {1}); 
		System.out.println("1=="+result); 
	}
}

class Solution {
    public int solution(int[] array) { // 0.01ms ~ 0.50ms
        int answer = -1;
        int maxCnt = 0;
        
        for (int i = 0; i < array.length; i++) {
        	int cnt = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
                    cnt++;
                }
				// 현재 요소의 빈도수가 최빈값보다 크면 최빈값과 빈도수를 업데이트
	            if (cnt > maxCnt) {
	            	maxCnt = cnt;
	            	answer = array[i];
	            } else if (cnt == maxCnt && answer != array[i]) {
	            	answer = -1;
	            }
			}
		}
        return answer;
    }
}