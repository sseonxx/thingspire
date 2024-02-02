package com.thingspire.seonha.chap01;

public class Solution1 {
    /*
    문제 설명
    정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을 return하도록 solution 함수를 완성해주세요

    제한사항
    0 ≤ n ≤ 1,000,000

     */
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        for (int i=0; i<str.length(); i++) {
            answer += Integer.parseInt(str.substring(i, i+1));
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution1 sol1 = new Solution1();
        int num1 = 1234;
        int num2 = 930211;
        int result = sol1.solution(num2);
        System.out.println("각 자리 숫자의 합: " + result);

    }


}
