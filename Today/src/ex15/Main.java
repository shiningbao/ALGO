package ex15;

/*	0 떼기
	정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		result = sol.solution("0010");
		System.out.println("10=="+result); 		
		
		result = sol.solution("854020");
		System.out.println("854020=="+result); 		
		
		result = sol.solution("0012");
		System.out.println("12=="+result);
	}

}

class Solution {
    public String solution(String n_str) {
        String answer = "";
        boolean foundNonZero = false; // 0이 아닌 문자를 찾았는지 여부를 나타내는 플래그
        for (int i = 0; i < n_str.length(); i++) {
            if (n_str.charAt(i) != '0' || foundNonZero) { // 0이 아닌 문자를 찾았거나, 이미 0이 아닌 문자를 찾은 경우
                answer += n_str.charAt(i); // 해당 문자를 answer에 추가
                foundNonZero = true; // 0이 아닌 문자를 찾았음을 표시
            }
        }
        return answer;
        // return ""+Integer.parseInt(n_str); 이걸 왜 생각 못했을까...
    }
}