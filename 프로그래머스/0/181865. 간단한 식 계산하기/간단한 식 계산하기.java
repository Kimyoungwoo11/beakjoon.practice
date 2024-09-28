class Solution {
    public int solution(String binomial) {
        String[] parts = binomial.split(" ");
		int a = Integer.parseInt(parts[0]);
		int b = Integer.parseInt(parts[2]);
		int answer = 0;
		if (parts[1].equals("+")) {
			answer = a+b;
		}else if (parts[1].equals("-")) {
			answer = a-b;
		}else if(parts[1].equals("*")){
			answer = a*b;
		}
        return answer;
    }
}