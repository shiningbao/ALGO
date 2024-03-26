package ex61;

/* 문자열 여러 번 뒤집기
	문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다. queries의 원소는 [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다. 
	my_string에 queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution("rermgorpsam", new int[][] {{2,3}, {0,7}, {5,9}, {6,10}}); 
		System.out.println("programmers=="+result); 
	}
}

class Solution {
    public String solution(String my_string, int[][] queries) { // 0.09ms ~ 4.44ms
    	 StringBuilder sb = new StringBuilder(my_string);

         for (int[] query : queries) {
             int start = query[0];
             int end = query[1];

             StringBuilder s = new StringBuilder(sb.substring(start, end+1));
             s.reverse();
             sb.replace(start, end+1, s.toString());
         }

         return sb.toString();
    }
}