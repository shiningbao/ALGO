package ex10;


//더 크게 합치기
/*연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
12 ⊕ 3 = 123
3 ⊕ 12 = 312
양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		result = sol.solution(9,91);
		System.out.println("991=="+result); 		
		
		result = sol.solution(89,8);
		System.out.println("898=="+result); 		
	}

}

class Solution {
 public int solution(int a, int b) {
     int answer = 0;
     int ab = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
     int ba = Integer.parseInt(Integer.toString(b)+Integer.toString(a));
     answer = Math.max(ab,ba);

     return answer;
 }
}
