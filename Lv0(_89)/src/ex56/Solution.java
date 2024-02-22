package ex56;
// 5명씩
import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public String[] solution(String[] names) {
		 List<String> list = new ArrayList<String>();
		 for (int i = 0; i < names.length; i+=5) {
			 list.add(names[i]);
		}
		 return list.toArray(new String[0]);
 }
}
