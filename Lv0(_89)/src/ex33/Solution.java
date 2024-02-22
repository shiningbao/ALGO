package ex33;
// 길이에 따른 연산
public class Solution {

	 public int solution(int[] num_list) {
	        int answer = 0;
	        int multi = 1;
	        for(int i = 0; i<num_list.length; i++) {
	            if(num_list.length>=11){
	            	answer += num_list[i];
	            }else {
	            	multi *= num_list[i];
	            	answer = multi;
	            }
	        }
	        return answer;
	 }
	 
}
