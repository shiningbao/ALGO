package ex13;
import java.util.Arrays;


// 배열의 원소만큼 추가하기
/* 아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 
	양의 정수 배열 arr가 매개변수로 주어질 때, arr의 앞에서부터 차례대로 원소를 보면서 
	원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 배열 X를 return 하는 solution 함수를 작성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(new int[] {5,1,4});
		System.out.println("[5, 5, 5, 5, 5, 1, 4, 4, 4, 4]=="+Arrays.toString(result)); 		
		
		result = sol.solution(new int[] {6,6});
		System.out.println("[6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6]=="+Arrays.toString(result));	
		
		result = sol.solution(new int[] {1});
		System.out.println("[1]=="+Arrays.toString(result));	
	}

}

class Solution {
    public int[] solution(int[] arr) {
    	int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
    	int[] answer = new int[sum];
    	int index = 0;
    	for (int num : arr) {
           
    		for (int i = 0; i < num; i++) {
    			answer[index++] = num;
    			
    		}
        }
        return answer;
    }
}