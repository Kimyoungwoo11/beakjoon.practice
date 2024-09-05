class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String n = "0";
        String n2 = "0";
        for (int i = 0; i < num_list.length; i++) {
			if (num_list[i]%2==0) {
				n += num_list[i];
			}else {
				n2 += num_list[i];
			}
		}
        answer = Integer.parseInt(n) + Integer.parseInt(n2);
        return answer;
    }
}