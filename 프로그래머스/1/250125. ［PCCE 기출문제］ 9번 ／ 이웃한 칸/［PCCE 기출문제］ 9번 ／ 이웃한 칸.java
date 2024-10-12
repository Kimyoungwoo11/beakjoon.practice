class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int[] dh = {0, 1, -1, 0};
    	int[] dw = {1, 0, 0, -1};
    	String color = board[h][w]; //현재 칸의 색
    	int n = board.length;
    	for (int i = 0; i < 4; i++) {
			int nh = h + dh[i];
			int nw = w + dw[i];
			// 범위를 벗어나지 않는지 체크
	        if (nh >= 0 && nh < n && nw >= 0 && nw < n) {
	            // 같은 색이면 카운트를 증가시킴
	            if (board[nh][nw].equals(color)) {
	                answer++;
	            }
	        }
		}
        return answer;
    }
}