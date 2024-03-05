package ex18;

/*	l로 만들기
	알파벳 소문자로 이루어진 문자열 myString이 주어집니다. 
	알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		result = sol.solution("abcdevwxyz");
		System.out.println("lllllvwxyz=="+result); 		
		
		result = sol.solution("jjnnllkkmm");
		System.out.println("llnnllllmm=="+result); 		
	}

}

class Solution {
    public String solution(String myString) { // 0.89ms ~ 5.62ms
    	 char[] chars = myString.toCharArray(); 
         for (int i = 0; i < chars.length; i++) {
             if (chars[i] < 'l') { 
                 chars[i] = 'l';
             }
         }
         return new String(chars);
    }
}