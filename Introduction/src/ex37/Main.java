package ex37;

/*	외계어 사전
	PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다. 
	알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다. 
	spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 존재하지 않는다면 2를 return하도록 solution 함수를 완성해주세요.
*/
public class Main {

	public static void main(String[] args) {
		int result = 0;
		Solution sol = new Solution();
		
		result = sol.solution(new String[] {"p", "o", "s"}, new String[] {"sod", "eocd", "qixm", "adio", "soo"}); 
		System.out.println("2=="+result); 
		
		result = sol.solution(new String[] {"z", "d", "x"}, new String[] {"def", "dww", "dzx", "loveaw"}); 
		System.out.println("1=="+result); 
		
		result = sol.solution(new String[] {"s", "o", "m", "d"}, new String[] {"moos", "dzx", "smm", "sunmmo", "som"}); 
		System.out.println("2=="+result); 

	}
}

class Solution {
    public int solution(String[] spell, String[] dic) { // 0.03ms ~ 0.22ms
	int answer = 2; 
	int idx = 0;
        
    for(int i = 0; i < dic.length; i++) {
    	idx = 0;
        for(int j = 0; j < spell.length; j++) {
            if(dic[i].contains(spell[j])) 
            	idx++;
            if(idx == spell.length) 
            	answer = 1;
        }
    }    
    return answer;
    }
}