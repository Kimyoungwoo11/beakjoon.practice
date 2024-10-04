class Solution {
    public String solution(String n_str) {
        String answer = n_str.replaceFirst("^0+", ""); //가장 왼쪽의 0 제거
        return answer;
    }
}