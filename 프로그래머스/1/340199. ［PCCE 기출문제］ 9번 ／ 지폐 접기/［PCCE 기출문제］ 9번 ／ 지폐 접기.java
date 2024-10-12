class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        while (Integer.max(wallet[1], wallet[0]) < Integer.max(bill[0], bill[1]) || Integer.min(wallet[1], wallet[0]) < Integer.min(bill[0], bill[1])) {
			if (bill[0] > bill[1]) {
				bill[0] = bill[0]/2;
				answer++;
			}else if (bill[1] > bill[0]) {
				bill[1] = bill[1]/2;
				answer++;
			}
		}
        return answer;
    }
}