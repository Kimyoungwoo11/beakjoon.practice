import java.util.ArrayList;
import java.util.List;
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        List<String> mystr = new ArrayList<String>();
        // 1. my_string을 m 글자씩 잘라서 리스트에 저장
        for (int i = 0; i < my_string.length(); i += m) {
            // m 글자씩 잘라서 mystr 리스트에 추가
            mystr.add(my_string.substring(i, Math.min(i + m, my_string.length())));
        }
        
        // 2. 각 줄에서 c번째 글자 추출
        for (String str : mystr) {
            if (str.length() >= c) { // c가 문자열 길이 내에 있는지 확인
                answer += str.charAt(c - 1); // c번째 글자 (0-based index이므로 c-1)
            }
        }
        return answer;
    }
}