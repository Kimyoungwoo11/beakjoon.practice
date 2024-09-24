class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int n = pat.length();
        for (int i = 0; i < myString.length() - n + 1; i++) {
			if (myString.substring(i, n+i).equals(pat)) {
				answer++;
			}
		}
        return answer;
    }
}