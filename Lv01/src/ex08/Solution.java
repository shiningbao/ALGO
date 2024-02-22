package ex08;

public class Solution {
	
    public int solution(int angle) {
        int answer = 0;
        /*
        1 예각 : 0 < angle < 90
		2 직각 : angle = 90
		3 둔각 : 90 < angle < 180
		4 평각 : angle = 180
         */
        
        if(0 < angle && angle < 90) {
        	answer = 1;
        }
        
        if(angle == 90) {
        	answer = 2;
        }
        
        if(90 < angle && angle < 180) {
        	answer = 3;
        }
        
        if(angle == 180) {
        	answer = 4;
        }  
        
        return answer;
    }

}
