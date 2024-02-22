package ex55;
// 배열의 길이에 따라 다른 연산하기
public class Solution {

	 public int[] solution(int[] arr, int n) {
	        int[] answer = {};
	        
	        for (int i = 0; i < arr.length; i++) {
				if(arr.length%2==0 && i%2!=0) {
					arr[i]+=n;
				}
				if(arr.length%2!=0 && i%2==0) {
					arr[i]+=n;
				}
			}
	        return arr;
	    }
}
