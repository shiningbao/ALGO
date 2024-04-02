package ex23;

/*	문자 리스트를 문자열로 변환하기
	문자들이 담겨있는 배열 arr가 주어집니다. arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		result = sol.solution(new String[] {"a","b","c"});
		System.out.println("abc=="+result);
	}
}

class Solution {
    public String solution(String[] arr) { 
		/* 1.33ms ~ 2.20ms
			String answer = "";
			
			for (int i = 0; i < arr.length; i++) { 
				answer += arr[i]; 
			}
		*/
        return String.join("", arr); // join -> 배열을 문자열로0.05ms ~ 0.38ms
    }
}