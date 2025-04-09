package ex32;

public class Main { /* 멀리 뛰기
효진이는 멀리 뛰기를 연습하고 있습니다. 효진이는 한번에 1칸, 또는 2칸을 뛸 수 있습니다. 칸이 총 4개 있을 때, 효진이는
(1칸, 1칸, 1칸, 1칸)
(1칸, 2칸, 1칸)
(1칸, 1칸, 2칸)
(2칸, 1칸, 1칸)
(2칸, 2칸)
의 5가지 방법으로 맨 끝 칸에 도달할 수 있습니다. 
멀리뛰기에 사용될 칸의 수 n이 주어질 때, 효진이가 끝에 도달하는 방법이 몇 가지인지 알아내, 여기에 1234567를 나눈 나머지를 리턴하는 함수, solution을 완성하세요. 
예를 들어 4가 입력된다면, 5를 return하면 됩니다.
*/

	public static void main(String[] args) {
		long result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(4); 
		System.out.println("5=="+result);
		
		result = sol.solution(3); 
		System.out.println("3=="+result);
	}	
}

class Solution {
    public long solution(int n) { // 0.04ms ~ 0.17ms
        long answer = n ==1 ? 1 : (n == 2 ? 2 : 0);
        int[] arr = new int[n+1];
        
        arr[1] = 1;
        if (n >= 2) arr[2] = 2;
        
        for (int i = 3; i <= n; i++) {
			arr[i] = (arr[i-1] + arr[i-2]) % 1234567; 
			answer = arr[i];
		}

        return answer;
    }
}