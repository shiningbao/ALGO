package ex13;

/*	부분 문자열 이어 붙여 문자열 만들기
	길이가 같은 문자열 배열 my_strings와 이차원 정수 배열 parts가 매개변수로 주어집니다. 
	parts[i]는 [s, e] 형태로, my_string[i]의 인덱스 s부터 인덱스 e까지의 부분 문자열을 의미합니다. 
	각 my_strings의 원소의 parts에 해당하는 부분 문자열을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		result = sol.solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][]{{0,4},{1,2},{3,5},{7,7}});
		System.out.println("programmers=="+result); 		
	}

}

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
		// 0.05ms~0.53ms
		 StringBuilder answer = new StringBuilder(); // StringBuilder 객체 생성
		 
		 for (int i = 0; i < parts.length; i++) { 
			 int start = parts[i][0]; 
			 int end = parts[i][1];
		
			 for (int j = start; j <= end; j++) { 
				 answer.append(my_strings[i].charAt(j));
			 } 
		 }
		 
		 return answer.toString(); // StringBuilder를 String으로 변환 -> StringBuilder 를 이용하는게 더 빠르다.
		     
		/* 10.23ms~38.09ms
		 * String answer = "";
		 * 
		 * for (int i = 0; i < parts.length; i++) { 
		 * 		int start = parts[i][0]; 
		 * 		int end = parts[i][1];
		 * 
		 * 		for (int j = start; j <= end; j++) { 
		 * 		answer += my_strings[i].charAt(j); 
		 * 		} 
		 * }
		 * 
		 * return answer;
		 */
    	}
}