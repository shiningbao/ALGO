package ex08;

public class Solution {

	public String solution(String my_string) {
        String answer = "";
       /* int len = my_string.length();
        char[]arr = new char[len];
       
        for (int i = 0; i <len; i++) {
				arr[(len-1)-i]=my_string.charAt(i);
			}
        
        answer = new String(arr);
        */
        
        // StringBuilder 를 활용한 방법
        StringBuilder builder = new StringBuilder(my_string);
        answer = builder.reverse().toString();
        return answer;
    }
}
