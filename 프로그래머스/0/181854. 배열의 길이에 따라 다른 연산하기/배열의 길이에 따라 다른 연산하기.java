class Solution {
    public int[] solution(int[] arr, int n) {
          int[] answer = new int[arr.length];
     // 배열의 길이가 홀수인 경우
        if (arr.length % 2 != 0) {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        } 
        // 배열의 길이가 짝수인 경우
        else {
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    answer[i] = arr[i] + n;
                } else {
                    answer[i] = arr[i];
                }
            }
        }
        return answer;
    }
}