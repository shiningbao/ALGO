package ex27;
//뒤에서 5등 위로
import java.util.Arrays;

public class Solution {

	public int[] solution(int[] num_list) {
        int[] answer = {};
        Arrays.sort(num_list);
        System.out.println(Arrays.toString(num_list));
        answer = Arrays.copyOfRange(num_list,5,num_list.length);
        return answer;
    }
}
