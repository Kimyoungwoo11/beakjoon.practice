import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> list = new ArrayList<>();
        for (String str : strArr) {
			if (!str.contains("ad")) {
				list.add(str);
			}
		}
        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        return answer;
    }
}