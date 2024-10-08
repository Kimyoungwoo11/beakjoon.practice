class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int index = 0;
        for (int i = 0; i < picture.length; i++) {
			String s = picture[i];
			StringBuilder sb = new StringBuilder();
			
			for (int j = 0; j < s.length(); j++) {
				sb.append(String.valueOf(s.charAt(j)).repeat(k));
			}
			for (int j = 0; j < k; j++) {
				answer[index++] = sb.toString();
			}
		}
        return answer;
    }
}