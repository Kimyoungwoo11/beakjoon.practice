class Solution {
    public int[] solution(int[] arr, int[] query) {
        int startIndex = 0;
        int endIndex = arr.length -1;
        // query 배열을 순회하면서 시작 및 끝 인덱스를 업데이트
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                // query의 인덱스가 짝수일 때: 끝 인덱스를 업데이트
                endIndex = startIndex + query[i];
            } else {
                // query의 인덱스가 홀수일 때: 시작 인덱스를 업데이트
                startIndex += query[i];
            }
        }
        int[] answer = new int[endIndex - startIndex + 1];
        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
			answer[index++] = arr[i];
		}
        return answer;
    }
}