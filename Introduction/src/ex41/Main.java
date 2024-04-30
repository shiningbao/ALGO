package ex41;

/*	로그인 성공?
	머쓱이는 프로그래머스에 로그인하려고 합니다. 머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴 2차원 배열 db가 주어질 때, 
	다음과 같이 로그인 성공, 실패에 따른 메시지를 return하도록 solution 함수를 완성해주세요.

	아이디와 비밀번호가 모두 일치하는 회원정보가 있으면 "login"을 return합니다.
	로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 “fail”를, 아이디는 일치하지만 비밀번호가 일치하는 회원이 없다면 “wrong pw”를 return 합니다.
*/
public class Main {

	public static void main(String[] args) {
		String result = "";
		Solution sol = new Solution();
		
		result = sol.solution(new String[] {"meosseugi", "1234"}, new String[][] {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}); 
		System.out.println("login=="+result); 
		
		result = sol.solution(new String[] {"programmer01", "15789"}, new String[][] {{"programmer02", "15789"}, {"programmer00", "134"}, {"programmer01", "1145"}}); 
		System.out.println("wrong pw=="+result); 
		
		result = sol.solution(new String[] {"rabbit04", "98761"}, new String[][] {{"jaja11", "98761"}, {"krong0313", "98761"}, {"rabbit00", "111333"}}); 
		System.out.println("fail=="+result); 
	}
}

class Solution {
    public String solution(String[] id_pw, String[][] db) { // 0.01ms ~ 0.05ms
        String answer = "fail";
        String id = id_pw[0];
        String pw = id_pw[1];
        
        for (int i = 0; i < db.length; i++) {
            if (id.equals(db[i][0])) {
                if (pw.equals(db[i][1])) {
                    return "login";
                } else {
                    return "wrong pw"; 
                }
            }
        }
        
        return answer;
    }
}