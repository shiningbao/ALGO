package ex10;

public class Solution {
	
    public int solution(int n, int k) {        
        // 1. 총금액 알기
        int yang = n * 12000;
        int drink = k * 2000;
        System.out.println(yang+drink);        
        // 2. 서비스 금액 알기
        int free = (n/10)*2000;        
        // 3. 총금액 - 서비스        
        return yang+drink-free;
    }

}
