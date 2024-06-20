package type;

public class Solution {

	public static void main(String[] args) {
		double epsilon = 1E-5;
		System.out.println(epsilon);
		
		// 부동소수점 수 오차 검사
		double a = 0.1 + 0.2;
		double b = 0.3;
		
		System.out.println(a-b);
		
		if(a == b) {
			System.out.println("a와 b는 같은 값입니다.");
		}else {
			System.out.println("a와 b는 다른 값입니다.");
		}
		
		if(Math.abs(a-b) < epsilon) {
			System.out.println("a와 b는 같은 값입니다.");
		}else {
			System.out.println("a와 b는 다른 값입니다.");
		}

	}

}
