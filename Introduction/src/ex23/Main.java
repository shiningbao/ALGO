package ex23;

import java.util.Arrays;

/*	한 번만 등장한 문자
	문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution("abcabcadc"); 
		System.out.println("d=="+result); 
		
		result = sol.solution("abdc"); 
		System.out.println("abcd=="+result);  
		
		result = sol.solution("hello"); 
		System.out.println("eho=="+result); 

	}
}

class Solution {
    public String solution(String s) { // 1.40ms ~ 3.08ms
    	String answer = "";
    	String[] arr=s.split("");
        
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            int cnt=0;
            for(int j=0; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    cnt++;
                }
            }
            if(cnt==1){
                answer += arr[i];
            }            
        }
        
        return answer;
    }
}