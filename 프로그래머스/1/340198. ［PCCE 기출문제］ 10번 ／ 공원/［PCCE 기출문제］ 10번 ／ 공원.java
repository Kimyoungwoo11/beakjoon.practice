import java.util.Arrays;
class Solution {
    public int solution(int[] mats, String[][] park) {
		int answer = -1;
        // 돗자리 크기 내림차순으로 정렬
		Arrays.sort(mats); // 오름차순으로 변경 후 반복문으로 내림차순으로 변환
		for (int i = 0; i < mats.length / 2; i++) {
			int temp = mats[i];
			mats[i] = mats[mats.length - 1 - i];
			mats[mats.length - 1 - i] = temp;
		}
		int rows = park.length;
		int cols = park[0].length;
		// 돗자리 크기별로 가장 큰 것부터 탐색
		for (int matSize : mats) {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if (canPlaceMat(i,j,matSize,park)) {
						return matSize;
					}
				}
			}
		}
        return answer;
    }
	// 돗자리를 깔 수 있는지 확인하는 함수
			boolean canPlaceMat(int r, int c, int k, String[][] park) {
				int rows = park.length;
				int cols = park[0].length;
				if (r + k > rows || c + k > cols) { // 돗자리가 공원을 벗어나는 경우
					return false;
				}
				for (int i = r; i < r+k; i++) {
					for (int j = c; j < c+k; j++) {
						if (!park[i][j].equals("-1")) { // 사람이 있거나 이미 사용된 공간
							return false;
						}
					}
				}
				return true;
			}
}