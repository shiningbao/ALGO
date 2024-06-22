package Solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Ex04 { // 두 개 뽑아서 더하기
	// numbers에서 서로 다른 인덱스에 있는 2개의 수를 뽑아 더해 만들 수 있는 모든 수를 배열에 오름차순으로 담아 반환

	public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 3, 4, 1})));
        System.out.println(Arrays.toString(solution(new int[]{5, 0, 2, 7})));
    }

    // 이 부분을 변경해서 실행해보세요.
    private static int[] solution(int[] numbers) {
    HashSet<Integer> set = new HashSet<>();
    
    for (int i = 0; i < numbers.length; i++) {
		for (int j = i+1; j < numbers.length; j++) {
			set.add(numbers[i] + numbers[j]);
		}
	}
    	
    return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }


}
