package ex28;

import java.util.ArrayList;
import java.util.Arrays;

/*	문자열 잘라서 정렬하기
	문자열 myString이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
	단, 빈 문자열은 반환할 배열에 넣지 않습니다.
*/
public class Main {

	public static void main(String[] args) {
		String[] result = {};
		Solution sol = new Solution();
		
		result = sol.solution("axbxcxdx");
		System.out.println("[\"a\",\"b\",\"c\",\"d\"]=="+Arrays.toString(result));
		
		result = sol.solution("dxccxbbbxaaaa");
		System.out.println("[\"aaaa\",\"bbb\",\"cc\",\"d\"]=="+Arrays.toString(result));
		
		result = sol.solution("xccxbbbx");
		System.out.println("[\"bbb\",\"cc\"]=="+Arrays.toString(result));
	}
}

class Solution {
    public String[] solution(String myString) { // 4.29ms ~ 26.04ms
        String[] splitArr = myString.split("x");
        ArrayList<String> resultList = new ArrayList<>();
        
        for (String str : splitArr) {
            if (!str.isEmpty()) {
                resultList.add(str);
            }
        }
        
        String[] resultArr = resultList.toArray(new String[resultList.size()]);
        Arrays.sort(resultArr);
     
        return resultArr;
    }
    
}