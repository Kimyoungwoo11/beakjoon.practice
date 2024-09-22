class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int n = 1;
        if (num_list.length >= 11) {
			for (int i : num_list) {
				answer += i;
			}
		}else {
			for (int i : num_list) {
				n *= i;
			}
			answer = n;
		}
        return answer;
    }
}