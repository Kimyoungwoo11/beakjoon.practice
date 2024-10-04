import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        // 문자열을 BigInteger로 변환
        BigInteger num1 = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        
        // 두 수를 더한 결과
        BigInteger result = num1.add(num2);
        answer = result.toString();
        return answer;
    }
}