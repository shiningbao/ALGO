package ex11;


// 접미사인지 확인하기
/* 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다. 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
문자열 my_string과 is_suffix가 주어질 때, is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution("banana","ana");
		System.out.println("1=="+result); 		
		
		result = sol.solution("banana","nan");
		System.out.println("0=="+result); 
		
		result = sol.solution("banana","wxyz");
		System.out.println("0=="+result); 	
		
		result = sol.solution("banana","abanana");
		System.out.println("0=="+result); 	
	}

}

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if(my_string.endsWith(is_suffix)) {
        	answer = 1;
        }else {
        	answer = 0;
        }
        
        return answer;
    }
}
