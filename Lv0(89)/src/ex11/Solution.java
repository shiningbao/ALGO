package ex11;
// 옷가게 할인받기
public class Solution {

	 public int solution(int price) {
	        int answer = price;
	        if(price>=100000&&price<300000) {
	        	answer = (int) (price*0.95);
	        }
	        else if (price>=300000&&price<500000) {
	        	answer = (int)(price*0.90);
	        }
	        else if(price>=500000) {
	        	answer = (int)(price*0.80);
	        }
	        return answer;
	    }
}
