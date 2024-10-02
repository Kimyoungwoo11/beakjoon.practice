import java.util.Stack;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (stack.isEmpty()) {
				stack.push(arr[i]);
				continue; // i에 1을 더합니다. (continue로 다시 for문 시작 즉 + 1이 됨)
			}
			if (stack.peek() == arr[i]) {
				stack.pop();
				continue;
			}
			stack.push(arr[i]);
		}
		if (stack.isEmpty()) {
			return new int[]{-1};
		}
        int[] answer = new int[stack.size()];
        for (int i = answer.length-1; i >= 0; i--) {
			answer[i] = stack.pop();
		}
        return answer;
    }
}