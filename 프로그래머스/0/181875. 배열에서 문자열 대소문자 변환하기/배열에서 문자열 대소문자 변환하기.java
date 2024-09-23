class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int index = 0;
        for (int i = 0; i < answer.length; i++) {
			if (i%2 == 0) {
				answer[index++] = strArr[i].toLowerCase();
			}else {
				answer[index++] = strArr[i].toUpperCase();
			}
		}
        return answer;
    }
}