package ex30;

/*	9로 나눈 나머지
	음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
	이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때, 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution("123");
		System.out.println("6=="+result);
		
		result = sol.solution("78720646226947352489");
		System.out.println("2=="+result);
	}
}

class Solution {
    public int solution(String number) { // 0.02ms ~ 5.24ms
        int answer = 0;
        for (int i = 0; i < number.length(); i++) {
			answer += number.charAt(i)-'0'; // 문자열에서 해당 문자를 숫자 값으로 변환
		}
        return answer%9;
    }
}