package ex06;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] result = {};
		result = sol.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12});
		System.out.println("[6, 9, 12]=="+Arrays.toString(result));
		
		result = sol.solution(5, new int[] {1, 9, 3, 10, 13, 5});
		System.out.println("[10, 5]=="+Arrays.toString(result));
		
		result = sol.solution(12, new int[] {2, 100, 120, 600, 12, 12});
		System.out.println("[120, 600, 12, 12]=="+Arrays.toString(result));

//		정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록 solution 함수를 완성해주세요.

	}
}

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        
        int count = 0;
        
        	for(int i=0; i<numlist.length; i++) {
        		if(numlist[i]%n==0){
        			count++;
                }
            }
            answer = new int[count];
            // System.out.println(Arrays.toString(answer));
            int index=0;
                
            for(int i=0; i<numlist.length; i++) {
                if(numlist[i]%n==0){
                    answer[index]=numlist[i];
                    index++;
                }
            }
            
           return answer;
           
        
           	/*
             ArrayList<Integer> answer = new ArrayList<>();

        		for(int num : numlist){
            		if(num % n == 0){
                		answer.add(num);
            		}
        		} 
        	return answer;
          */
            }
}
