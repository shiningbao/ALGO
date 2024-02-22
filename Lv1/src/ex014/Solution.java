package ex014;

public class Solution {
	
	 boolean solution(String s) {
	        boolean answer = true;
	        // 전체 소문자로 변환
	        String lowStr = s.toLowerCase();
	        int p = 0;
	        int y = 0;
	        // 0.13ms~0.69ms
	       /* for (String str : lowStr.split("")) {
				if(str.equals("p")) {
					p++;
				}
				 if(str.equals("y")) {
					y++;
					
						
					}
			}*/
	        // 0.02ms~0.06ms
	        char[] arr = lowStr.toCharArray();
	        for(char c : arr) {
	        	if (c=='p') {
	        		p++;
	        	}
	        	if(c=='y') {
	        		y++;
	        	}
	        }
	        
	       answer = p==y;
	        return answer;
	    }
    }

