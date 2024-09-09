class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        for (char c : number.toCharArray()) {
            sum += c - '0'; // 각 문자를 정수로 변환하여 합산
        }
        answer = sum%9;
        return answer;
    }
}