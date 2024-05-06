package ex48;

/* 	다항식 더하기
	한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다. 다항식을 계산할 때는 동류항끼리 계산해 정리합니다. 
	덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때, 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요. 
	같은 식이라면 가장 짧은 수식을 return 합니다.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution("3x + 7 + x"); 
		System.out.println("4x + 7=="+result); 
		
		result = sol.solution("x + x + x"); 
		System.out.println("3x=="+result); 

	}
}

class Solution {
    public String solution(String polynomial) { // 0.04ms ~ 8.87ms
        String answer = "";
        int x = 0;
        int n = 0;
        String[] polyArr = polynomial.split(" ");
      
        for(int i=0; i<polyArr.length; i++){
            if(polyArr[i].contains("x")){
                x += polyArr[i].equals("x") ? 1 : Integer.parseInt(polyArr[i].replace("x", ""));
            }else if(!polyArr[i].equals("+")){
                n += Integer.parseInt(polyArr[i]);
            }
        }
        
        if(x == 1 && n == 0){
            answer = "x";
        }else if(x == 1 && n != 0){
            answer = "x + " + n;
        }else if(x != 0 && n == 0){
            answer = x + "x";
        }else if(x != 0 && n != 0){
            answer = x + "x + " + n;
        }else if(x == 0 && n != 0){
            answer = Integer.toString(n);
        }

        return answer;
    }
}