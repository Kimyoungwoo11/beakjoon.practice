class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder trans = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
			char c = myString.charAt(i);
			if (c == 'A') {
				trans.append('B');
			}else if (c == 'B') {
				trans.append('A');
			}
		}
        if (trans.toString().contains(pat)) {
			//pat이 포함되어 있는지
        	answer = 1;
		}
        return answer;
    }
}