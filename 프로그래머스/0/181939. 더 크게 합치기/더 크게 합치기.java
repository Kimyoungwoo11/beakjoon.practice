class Solution {
    public int solution(int a, int b) {
        int add1 = Integer.parseInt(Integer.toString(a)+Integer.toString(b));
    	int add2 = Integer.parseInt(Integer.toString(b)+Integer.toString(a));
        int answer = 0;
        if (add1 > add2) {
			answer = add1;
		}else if (add2 > add1) {
			answer = add2;
		}else {
			answer = add1;
		}
        return answer;
}
}