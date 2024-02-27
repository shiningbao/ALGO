package ex11;

import java.util.Arrays;

// 배열의 원소 삭제하기
// 정수 배열 arr과 delete_list가 있습니다. arr의 원소 중 delete_list의 원소를 모두 삭제하고 
// 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		result = sol.solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12});
		System.out.println("[293, 395, 678]=="+Arrays.toString(result)); 		
	}

}

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
    	  int[] answer = new int[arr.length];
          int count = 0;

          for (int i = 0; i < arr.length; i++) {
              boolean delete = false;
              for (int j = 0; j < delete_list.length; j++) {
                  if (arr[i] == delete_list[j]) {
                      delete = true;
                      break;
                  }
              }
              
              if (!delete) {
                  answer[count++] = arr[i];
              }
          }
          
          return Arrays.copyOf(answer, count);
    }
}
