import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        String[] parts = myString.split("x");
		// 빈 문자열을 제외하고 리스트에 추가
	    List<String> filteredList = new ArrayList<>();
		for (String part : parts) {
			if (!part.isEmpty()) {
		        filteredList.add(part);
		    }
		}
        String[] answer = filteredList.toArray(new String[0]);
        Arrays.sort(answer);
        return answer;
    }
}