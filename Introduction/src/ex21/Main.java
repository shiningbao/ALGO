package ex21;

/*	k의 개수
	1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 
	정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(1, 13, 1); 
		System.out.println("6=="+result); 
		
		result = sol.solution(10, 50, 5); 
		System.out.println("5=="+result); 
		
		result = sol.solution(3, 10, 2); 
		System.out.println("0=="+result); 
	}
}

class Solution {
    public int solution(int i, int j, int k) { // 0.02ms ~ 12.00ms
    	int answer = 0;
    	
        for(int z = i; z<=j; z++) {
            int x = z;
            while (x != 0) {
                if (x % 10 == k) {
                    answer++;
                }
                x /= 10;
            }
        }

        return answer;
    }
}