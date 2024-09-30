import java.util.List;
import java.util.ArrayList;
class Solution {
    public String[] solution(String myStr) {
        String[] splitStrings = myStr.split("[abc]+");

        // 빈 문자열이 아닌 것들만 리스트에 추가
        List<String> result = new ArrayList<>();
        for (String s : splitStrings) {
            if (!s.isEmpty()) {
                result.add(s);
            }
        }

        // 결과가 비어있으면 "EMPTY" 반환
        if (result.isEmpty()) {
            return new String[]{"EMPTY"};
        }
        String[] answer = result.toArray(new String[0]);
        return answer;
    }
}