import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();

        // arr의 각 요소를 확인
        for (int i = 0; i < arr.length; i++) {
            boolean found = false; // 현재 arr[i]가 delete_list에 있는지 확인하기 위한 플래그

            // delete_list의 각 요소를 확인
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    found = true; // 삭제할 요소를 찾았으면 플래그를 true로 설정
                    break; // 더 이상 확인할 필요 없음
                }
            }

            // delete_list에 포함되지 않은 경우
            if (!found) {
                result.add(arr[i]); // 결과 리스트에 추가
            }
        }
        answer = result.stream().mapToInt(i->i).toArray();
        return answer;
    }
}