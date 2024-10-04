class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        for (int i = 1; i <= 3; i++) {
            int maxRank = Integer.MAX_VALUE; // 현재까지 찾은 최저 랭킹을 저장
            int idx = -1; // 현재까지 찾은 최저 랭킹의 인덱스
            
            // 모든 참가자를 검사하여 현재 순위에 해당하는 최저 랭킹을 찾기
            for (int j = 0; j < rank.length; j++) {
                // 현재 인덱스가 참가하고 있으며, 랭킹이 maxRank보다 낮으면
                if (attendance[j] && maxRank > rank[j]) {
                    idx = j; // 인덱스를 업데이트
                    maxRank = rank[j]; // 최저 랭킹을 업데이트
                }
            }
            
            // 찾은 인덱스의 참가 상태를 false로 변경하여 다음 순위를 찾도록 함
            attendance[idx] = false;
            
            // 각 순위에 따라 결과를 계산
            if (i == 1) {
                answer += 10000 * idx; // 1등: 10000배수
            } else if (i == 2) {
                answer += 100 * idx; // 2등: 100배수
            } else if (i == 3) {
                answer += idx; // 3등: 1배수
            }
        }
        return answer;
    }
}