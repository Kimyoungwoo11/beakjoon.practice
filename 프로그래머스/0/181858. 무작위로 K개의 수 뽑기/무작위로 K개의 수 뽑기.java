import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class Solution {
    public int[] solution(int[] arr, int k) {
        Set<Integer> s = new HashSet<>(); //중복 제거를 위한 Set
		List<Integer> l = new ArrayList<>(); //결과 저장할 list
		for (int num : arr) {
			if (!s.contains(num)) { //중복되지 않은 값 추가
				s.add(num);
				l.add(num);
			}
			//결과가 k만큼 되면 종료
			if (l.size() == k) {
				break;
			}
		}
		//결과가 k보다 작으면 -1로 채움
		while (l.size() < k) {
			l.add(-1);
		}
        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
			answer[i] = l.get(i);
		}
        return answer;
    }
}