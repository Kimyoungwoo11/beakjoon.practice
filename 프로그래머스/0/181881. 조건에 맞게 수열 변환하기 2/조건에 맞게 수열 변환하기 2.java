class Solution {
    public int solution(int[] arr) {
        int result = 0;  // 연산 횟수를 저장할 변수
        boolean flag = false;  // 배열이 더 이상 변화하지 않는지 확인하기 위한 플래그
        
        // 배열이 더 이상 변화하지 않을 때까지 반복
        while (!flag) {
            flag = true;  // 매 반복 시 플래그를 true로 설정
            for (int i = 0; i < arr.length; i++) {
                // 현재 요소가 50 이상이고 짝수인 경우
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;  // 요소를 절반으로 나눈다
                    flag = false;  // 배열이 변화했으므로 플래그를 false로 설정
                }
                // 현재 요소가 50 미만이고 홀수인 경우
                else if(arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;  // 요소를 두 배로 하고 1을 더한다
                    flag = false;  // 배열이 변화했으므로 플래그를 false로 설정
                }
            }
            result++;  // 반복이 끝날 때마다 연산 횟수 증가
        }
        
        return result-1;
    }
}