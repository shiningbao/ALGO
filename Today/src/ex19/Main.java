package ex19;

/*	가까운 1 찾기
	정수 배열 arr가 주어집니다. 이때 arr의 원소는 1 또는 0입니다. 
	정수 idx가 주어졌을 때, idx보다 크면서 배열의 값이 1인 가장 작은 인덱스를 찾아서 반환하는 solution 함수를 완성해 주세요.
	단, 만약 그러한 인덱스가 없다면 -1을 반환합니다.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		result = sol.solution(new int[]{0, 0, 0, 1},1);
		System.out.println("3=="+result); 		
		
		result = sol.solution(new int[]{1, 0, 0, 1, 0, 0},4);
		System.out.println("-1=="+result); 		
		
		result = sol.solution(new int[]{1, 1, 1, 1, 0},3);
		System.out.println("3=="+result); 		
	}

}

class Solution {
    public int solution(int[] arr, int idx) { // 0.02ms ~ 0.38ms
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
			if(i>=idx&&arr[i]==1) {
				answer = i;
				break;
			}else {
				answer = -1;
			}
			
		}
        return answer;
    }
}