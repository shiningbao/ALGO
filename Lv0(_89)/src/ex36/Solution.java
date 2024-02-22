package ex36;

//첫 번째로 나오는 음수
public class Solution {

	public int solution(int[] num_list) {
        int answer = -1;
        int i = 0;
        while(i<num_list.length) {
        	if(num_list[i]<0) {
        		answer = i;
        		break;
        	}
        	i++;
        }
        return answer;
	
}
}
