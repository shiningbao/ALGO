package ex51;

import java.util.Arrays;

/* 	분수의 덧셈
	첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 
	두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
*/
public class Main {

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution(1, 2, 3, 4); 
		System.out.println("[5, 4]=="+Arrays.toString(result)); 
		
		result = sol.solution(9, 2, 1, 3); 
		System.out.println("[29, 6]=="+Arrays.toString(result)); 
	}
}

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) { // 0.02ms ~ 5.65ms
        int[] answer = new int[2];
        
        if(denom1 != denom2) {
        	numer1 = numer1*denom2;
        	numer2 = numer2*denom1;
        	denom1 = denom1*denom2;
        	denom2 = denom2*denom1;
        }
        answer[0] = numer1+numer2;
        answer[1] = denom1;
        
        int gcd = 0;
        
        //최대공약수 찾기
        for(int i=1; i <= answer[0] && i <= answer[1]; i++){
            if( answer[0]%i == 0 && answer[1]%i ==0 ){
                gcd = i;
            }
        }
        
        answer[0] /= gcd;
        answer[1] /= gcd;
        
        return answer;
    }
}