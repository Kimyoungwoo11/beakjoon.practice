class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        // 문자열 code의 각 인덱스에 대해 나머지가 r인 위치의 문자만 가져오기
        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {  // 인덱스를 q로 나눈 나머지가 r인 경우
                answer += code.charAt(i);  // 해당 위치의 문자 추가
            }
        }

        return answer;
    }
}