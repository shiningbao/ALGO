package ex01;

/* 	최댓값과 최솟값
	문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. 
	str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
	예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
	
		result = sol.solution("1 2 3 4"); 
		System.out.println("1 4=="+result);
		
		result = sol.solution("-2 2 1 0"); 
		System.out.println("-2 2=="+result);
		
		result = sol.solution("-1 -1"); 
		System.out.println("-1 -1=="+result);
	}
	
}

class Solution {
    public String solution(String s) { // 8.06ms ~ 11.29ms
    	String answer = "";
        String[] sArr = s.split(" ");
        int max, min, tmp;
        max = min = Integer.parseInt(sArr[0]);
        
        for (int i = 1; i < sArr.length; i++) {
        	tmp = Integer.parseInt(sArr[i]);
			max = Math.max(max, tmp);
			min = Math.min(min, tmp);
		}
        
        answer = min + " " + max;
        return answer;
    }
}