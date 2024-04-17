package ex25;

import java.util.Arrays;

/*	컨트롤 제트
	숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다. 문자열에 있는 숫자를 차례대로 더하려고 합니다. 이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다. 
	숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.
	
	1 ≤ s의 길이 ≤ 200
	-1,000 < s의 원소 중 숫자 < 1,000
	s는 숫자, "Z", 공백으로 이루어져 있습니다.
	s에 있는 숫자와 "Z"는 서로 공백으로 구분됩니다.
	연속된 공백은 주어지지 않습니다.
	0을 제외하고는 0으로 시작하는 숫자는 없습니다.
	s는 "Z"로 시작하지 않습니다.
	s의 시작과 끝에는 공백이 없습니다.
	"Z"가 연속해서 나오는 경우는 없습니다.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution("1 2 Z 3"); 
		System.out.println("4=="+result); 

		result = sol.solution("10 20 30 40"); 
		System.out.println("100=="+result); 
		
		result = sol.solution("10 Z 20 Z 1"); 
		System.out.println("1=="+result); 
		
		result = sol.solution("10 Z 20 Z"); 
		System.out.println("0=="+result); 
		
		result = sol.solution("-1 -2 -3 Z"); 
		System.out.println("-3=="+result); 

	}
}

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] sArr = s.split(" ");
        
        for(int i = 0 ; i < sArr.length ;i++){
            if(sArr[i].equals("Z")){
                answer -= Integer.parseInt(sArr[i-1]);  
            } else {
                answer += Integer.parseInt(sArr[i]);  
            }
        }
        return answer;
    }
}