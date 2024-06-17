package ex37;

/* 숫자 문자열과 영단어
	네오와 프로도가 숫자놀이를 하고 있습니다. 
	네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.

	다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
	
	1478 → "one4seveneight"
	234567 → "23four5six7"
	10203 → "1zerotwozero3"
	
	이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다. 
	s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.
	0	zero
	1	one
	2	two
	3	three
	4	four
	5	five
	6	six
	7	seven
	8	eight
	9	nine
*/
public class Main { 

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
	
		result = sol.solution("one4seveneight"); 
		System.out.println("1478=="+result);
		
		result = sol.solution("23four5six7"); 
		System.out.println("234567=="+result);
		
		result = sol.solution("2three45sixseven"); 
		System.out.println("234567=="+result);
		
		result = sol.solution("123"); 
		System.out.println("123=="+result);
	}
	
}

class Solution {
    public int solution(String s) { // 0.06ms ~ 0.11ms
        int answer = 0;
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i = 0; i < 10; i++) {
        	s = s.replace(num[i], Integer.toString(i));
		}
        
        answer = Integer.parseInt(s);
        return answer;
    }
}