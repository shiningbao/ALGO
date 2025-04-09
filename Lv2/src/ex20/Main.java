package ex20;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main { // 영어 끝말잇기

	public static void main(String[] args) {
		int[] result = {};
		Solution sol = new Solution();
	
		result = sol.solution(3, new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}); 
		System.out.println("[3, 3]=="+Arrays.toString(result));
		
		result = sol.solution(5, new String[] {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"}); 
		System.out.println("[0, 0]=="+Arrays.toString(result));
		
		result = sol.solution(2, new String[] {"hello", "one", "even", "never", "now", "world", "draw"}); 
		System.out.println("[1, 3]=="+Arrays.toString(result));
		
		result = sol.solution(5, new String[] {"ovea", "ama", "ama", "nabi", "ine", "eie", "ovea"}); 
		System.out.println("[3, 1]=="+Arrays.toString(result));


	}
	
}

class Solution {
    public int[] solution(int n, String[] words) { // 5.13ms ~ 7.85ms
        int[] answer = new int[2];
        Set<String> usedWords = new HashSet<>();
        usedWords.add(words[0]);

        for (int i = 1; i < words.length; i++) {
			String lastStr = words[i-1].charAt(words[i-1].length()-1)+""; // 단어의 끝 글자
			String current = words[i];
			
			if(!current.startsWith(lastStr)) { // 끝 글자로 시작 안할 때
				answer[0] = (i%n)+1;
				answer[1] = (i/n)+1;
				break;
			}
			
			if(usedWords.contains(current)) { // 중복된 단어일 때
				answer[0] = (i%n)+1;
				answer[1] = (i/n)+1;
				break;
			}
			usedWords.add(current);
		}
        
        return answer;
    }
}