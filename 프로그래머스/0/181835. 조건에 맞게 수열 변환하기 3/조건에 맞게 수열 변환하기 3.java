class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];
        int index = 0;
			if (k%2 != 0) {
				for (int i = 0; i < arr.length; i++) {
					answer[index++] = arr[i]*k;
				}
			}else if (k%2 == 0) {
				for (int i = 0; i < arr.length; i++) {
					answer[index++] = arr[i]+k;
				}
			}
        return answer;
    }
}