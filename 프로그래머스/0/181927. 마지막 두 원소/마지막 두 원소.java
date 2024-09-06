class Solution {
    public int[] solution(int[] num_list) {
        int last = num_list.length - 1;
    int secondLast = num_list.length - 2;
    int newValue;
    
    if (num_list[last] > num_list[secondLast]) {
        newValue = num_list[last] - num_list[secondLast];
    } else {
        newValue = num_list[last] * 2;
    }
    
    int[] answer = new int[num_list.length + 1];
    for (int i = 0; i < num_list.length; i++) {
        answer[i] = num_list[i]; 
    }
    answer[num_list.length] = newValue;  
    
    return answer;
    }
}