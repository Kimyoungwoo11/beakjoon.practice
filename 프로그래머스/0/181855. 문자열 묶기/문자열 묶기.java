class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] lengthCount = new int[31];  // 문자열의 최대 길이가 30이므로 31칸짜리 배열 준비 (길이 0~30)
        for (int i = 0; i < strArr.length; i++) {
        	int length = strArr[i].length();  // 각 문자열의 길이
            lengthCount[length]++;  // 해당 길이의 카운트를 증가시킴
		}
        for (int count : lengthCount) {
            answer = Math.max(answer, count);  // 가장 큰 값 찾기
        }
        return answer;
    }
}