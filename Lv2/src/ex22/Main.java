package ex22;

public class Main { // 점프와 순간 이동
	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
	
		result = sol.solution(5); 
		System.out.println("2=="+result);
		
		result = sol.solution(6); 
		System.out.println("2=="+result);
		
		result = sol.solution(5000); 
		System.out.println("5=="+result);
		
		result = sol.solution(17); 
		System.out.println("2=="+result);
		
		result = sol.solution(1); 
		System.out.println("1=="+result);
	}	
}

class Solution {
    public int solution(int n) { // 0.01ms ~ 0.03ms
        int ans = 0;
        
        while(n != 0) {
        	int r = n%2;
        	int num = n /= 2;
        	
        	if(r == 1) {
        		ans++;
        	}       	
        	if(num == 1) {
        		ans++;
        		break;
        	}        	
        }
        
        return ans;
    }
}