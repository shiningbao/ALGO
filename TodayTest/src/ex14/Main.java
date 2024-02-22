package ex14;
import java.util.Arrays;


// 순서 바꾸기
/* 정수 리스트 num_list와 정수 n이 주어질 때 
	num_list를 n 번째 원소 이후의 원소들과 n 번째까지의 원소들로 나눠 n 번째 원소 이후의 원소들을 n 번째까지의 원소들 앞에 붙인 리스트를 return하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {2,1,6},1);
		System.out.println("[1,6,2]=="+Arrays.toString(result)); 		
		
		result = sol.solution(new int[] {5,2,1,7,5},3);
		System.out.println("[7,5,5,2,1]=="+Arrays.toString(result));	
	}

}

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int idx = 0;
        for (int i = n; i < num_list.length; i++) {
			answer[idx++]+=num_list[i];
		}
        int nlLength = num_list.length-n;
        for (int i = 0; i < n; i++) {
			answer[nlLength++]+=num_list[i];
		}
        
        return answer;
    }
}