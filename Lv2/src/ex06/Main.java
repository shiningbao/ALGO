package ex06;

/* 	숫자의 표현
	Finn은 요즘 수학공부에 빠져 있습니다. 수학 공부를 하던 Finn은 자연수 n을 연속한 자연수들로 표현 하는 방법이 여러개라는 사실을 알게 되었습니다. 예를들어 15는 다음과 같이 4가지로 표현 할 수 있습니다.

	1 + 2 + 3 + 4 + 5 = 15
	4 + 5 + 6 = 15
	7 + 8 = 15
	15 = 15
	자연수 n이 매개변수로 주어질 때, 연속된 자연수들로 n을 표현하는 방법의 수를 return하는 solution를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
	
		result = sol.solution(15); 
		System.out.println("4=="+result);
		
		result = sol.solution(3); 
		System.out.println("2=="+result);
	}
	
}

class Solution {
    public int solution(int n) { // 효율성 1.04ms ~ 4.02ms
        int answer = 0;
        
        for(int i=1; i<=n; i++) {
            int sum = 0;
            for(int j=i; j<=n; j++) {
                sum += j;
                
                if(sum==n) {
                    answer++;
                    break;
                } else if(sum>n) {
                    break;
                }
            }
        }      
        
        /*	주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 약수 중 홀수의 개수와 같다. 0.07ms ~ 0.11ms
        	for (int i = 1; i <= num; i += 2) {
       			if (num % i == 0) {
           			answer++;
           		}
           	}
         */
        
        return answer;
    }
}