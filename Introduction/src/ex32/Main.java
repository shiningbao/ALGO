package ex32;

/*	영어가 싫어요
	영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		long result = 0;
		Solution sol = new Solution();
		
		result = sol.solution("onetwothreefourfivesixseveneightnine"); 
		System.out.println("123456789=="+result); 

		result = sol.solution("onefourzerosixseven"); 
		System.out.println("14067=="+result); 
	}
}

class Solution {
    public long solution(String numbers) { // 0.39ms ~ 1.68ms
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < words.length; i++) {
			numbers = numbers.replaceAll(words[i], String.valueOf(i));
		}

        return Long.parseLong(numbers);
    }
}