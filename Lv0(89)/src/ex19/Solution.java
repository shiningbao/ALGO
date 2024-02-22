package ex19;


// 아이스 아메리카노
public class Solution {

	 public int[] solution(int money) {
	        int[] answer =  new int[]{0,0};
	        int coffee = money/5500;
	        answer = new int[] {coffee,money-5500*coffee};
	        return answer;
	
	     
	    
    
    }
}
