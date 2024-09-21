class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int add = 0;
        for (int i = 0; i < numbers.length; i++) {
			add += numbers[i];
			if (add > n) {
				answer = add;
				break;
			}
		}
        return answer;
    }
}