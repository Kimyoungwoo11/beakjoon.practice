class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if (arr1.length > arr2.length) {
			answer = 1;
		}else if (arr2.length > arr1.length) {
			answer = -1;
		}else if (arr1.length == arr2.length) {
			int a = 0;
			int b = 0;
			for (int i : arr1) {
				a += i;
			}
			for (int i : arr2) {
				b += i;
			}
			if (a > b) {
				answer = 1;
			}else if (a < b) {
				answer = -1;
			}else if (a == b) {
				answer = 0;
			}
		}
        return answer;
    }
}