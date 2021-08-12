package com.kazurayam;

public class Calculator {

    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int x, int y) {
        return x * y;
    }

    static int divide(int x, int y) {
        return x / y;
    }

    static int power(int a, int b){
        int answer =a;
        for (int x = 2; x <= b; x++){
            answer *= a;
        }
        return answer;
    }

    static void main(String[] args) {
        System.out.printf("2 + 3 is %d" + Calculator.add(2, 3));
        System.out.printf("2 - 3 is %d" + Calculator.subtract(2, 3));
        System.out.printf("2 * 3 is %d" + Calculator.multiply(2, 3));
        System.out.printf("6 / 3 is %d" + Calculator.divide(6, 3));
        System.out.printf("2 ^ 3 is %d" + Calculator.power(2, 3));
    }

}
