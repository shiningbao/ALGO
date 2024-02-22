package ex48;

import java.util.Arrays;

public class Solution {
	
	 public int solution(String myString, String pat) {
	        int answer = 0;
	        /*
	        String[] strarr = new String[myString.length()];
	        char[] arr = myString.toCharArray();
	        // System.out.println(Arrays.toString(arr));
	        for (int i = 0; i < arr.length; i++) {
				if(arr[i]=='A') {
					strarr[i] = "B";
				}else if(arr[i]=='B') {
					strarr[i] = "A";
				}
			}
	        // System.out.println(Arrays.toString(strarr));
	        StringBuilder builder = new StringBuilder();
	        for (String str : strarr) {
				builder.append(str);
			}
	        String str = builder.toString();
	        if(str.contains(pat)) {
	        	answer = 1;
	        }
	        // System.out.println(str);
	         */
	        String rea = myString.replace("A", "a").replace("B", "A").replace("a", "B");
	        answer = rea.contains(pat) ? 1 : 0;
	        // System.out.println(rea);
	        return answer;
	    }
}
