class Solution {
    public int[] solution(int[] arr) {
        int n = arr.length;
		int twoX = 1;
		while (twoX < n) {
			twoX *=2;
		}
        int[] answer = new int[twoX];
        for (int i = 0; i < n; i++) {
			answer[i] = arr[i];
		}
        return answer;
    }
}