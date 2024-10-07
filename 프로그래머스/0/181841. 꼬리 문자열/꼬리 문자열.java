class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        StringBuilder result = new StringBuilder();
        for (String str : str_list) {
			if (!str.contains(ex)) {
				result.append(str);
			}
		}
        answer = result.toString();
        return answer;
    }
}