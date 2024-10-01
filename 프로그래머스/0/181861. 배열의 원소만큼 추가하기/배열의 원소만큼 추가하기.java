import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			for (int j = 0; j < num; j++) {
				x.add(num);
			}
		}
        int[] answer = new int[x.size()];
        for (int i = 0; i < x.size(); i++) {
			answer[i] = x.get(i);
		}
        return answer;
    }
}