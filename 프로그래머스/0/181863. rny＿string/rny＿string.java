class Solution {
    public String solution(String rny_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rny_string.length(); i++) {
			char c = rny_string.charAt(i);
			if (c == 'm') {
				sb.append("rn");
			}else {
				sb.append(c);
			}
		}
        answer = sb.toString();
        return answer;
    }
}