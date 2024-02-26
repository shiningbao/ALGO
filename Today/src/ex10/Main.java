package ex10;

import java.util.Arrays;

// 할 일 목록
// 오늘 해야 할 일이 담긴 문자열 배열 todo_list와 각각의 일을 지금 마쳤는지를 나타내는 boolean 배열 finished가 매개변수로 주어질 때, 
// todo_list에서 아직 마치지 못한 일들을 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
public class Main {

	public static void main(String[] args) {
		String[] result = {};
		Solution sol = new Solution();
		result = sol.solution(new String[]{"problemsolving", "practiceguitar", "swim", "studygraph"},new boolean[]{true, false, true, false});
		System.out.println("[\"practiceguitar\", \"studygraph\"]=="+Arrays.toString(result)); 		
		
	}

}

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
    	int unfinished = 0;
        for (boolean finish : finished) {
            if (!finish) {
                unfinished++;
            }
        }
        String[] answer = new String[unfinished];
        
        int count = 0;
        for (int i = 0; i < finished.length; i++) {
			if(!finished[i]) {
				answer[count++]=todo_list[i];
			}
		}
        return answer;
    }
}

/*
	다른 사람 풀이....
	class Solution {
	    public String[] solution(String[] todo_list, boolean[] finished) {
	        String str = "";
	        for(int i=0; i<finished.length; i++){
	            str = finished[i]==false ? str+todo_list[i]+"," : str;
	        }
	
	        return str.split(",");
	    }
	}

 */
