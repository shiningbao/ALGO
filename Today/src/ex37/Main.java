package ex37;

/*	글자 지우기
	문자열 my_string과 정수 배열 indices가 주어질 때, my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution("apporoograpemmemprs", new int[] {1, 16, 6, 15, 0, 10, 11, 3});
		System.out.println("programmers=="+result); 
		
	}
}

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
			for (int j = 0; j < indices.length; j++) {
				if(i!=indices[j]) {
					answer = my_string; 
				}
			}
		}
        return answer;
    }
}
