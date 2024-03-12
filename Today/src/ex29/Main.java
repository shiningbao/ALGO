package ex29;

/*	주사위 게임2
	1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.

	세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
	세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a^2 + b^2 + c^2 )점을 얻습니다.
	세 숫자가 모두 같다면 (a + b + c) × (a^2 + b^2 + c^2 ) × (a^3 + b^3 + c^3 )점을 얻습니다.
	세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(2,6,1);
		System.out.println("9=="+result);
		
		result = sol.solution(5,3,3);
		System.out.println("473=="+result);
		
		result = sol.solution(4,4,4);
		System.out.println("110592=="+result);
	}
}

class Solution {
    public int solution(int a, int b, int c) { // 0.01ms ~ 0.15ms
        int answer = 0;
        if(a==b&&b==c) {
        	answer = (int) ((a+b+c)*(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2))*(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3)));
        }else if(a!=b&&b!=c&&a!=c) {
        	answer = a+b+c;
        }else {
        	answer = (int) ((a+b+c)*(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2)));
        }
        return answer;
    }
}