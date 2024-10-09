class Solution {
    public int[][] solution(int n) {
        int[] dx = {1, 0, -1, 0};
    	int[] dy = {0, -1, 0, 1};
        int[][] answer = new int[n][n];
        int num = 1;
        int x = 0;
        int y = 0;
        int direction = 0; //현재 방향 (0: 오른쪽, 1: 위쪽, 2: 왼쪽, 3: 아래쪽)
        while (num <= n*n) {
			if (x >= 0 && x < n && y >= 0 && y < n && answer[y][x] == 0) {
				answer[y][x] = num ++;
			}else {
				x -= dx[direction];
				y -= dy[direction];
				direction = (direction + 1) % 4;
			}
			x += dx[direction];
			y += dy[direction];
		}
        return answer;
    }
}