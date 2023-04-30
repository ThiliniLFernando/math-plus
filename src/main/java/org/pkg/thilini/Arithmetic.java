package org.pkg.thilini;

public class Arithmetic {
    public static int plusNum(int... numbers) {
        int answer = 0;
        for (int i : numbers) {
            answer += i;
        }
        return answer;
    }

    public static float plusFloats(float... numbers) {
        float answer = 0;
        for (float i : numbers) {
            answer += i;
        }
        return answer;
    }

    public static float findAverage(int... numbers) {
        float answer = 0;
        for (int i : numbers) {
            answer += i;
        }
        answer = answer / numbers.length;
        return answer;
    }

    public static long multipleNum(long... numbers) {
        long answer = 0;
        for (long i : numbers) {
            answer *= i;
        }
        return answer;
    }

    public static float divideNum(float[] divisor, float[] dividend) {
        float quotient = 0;
        float divisorTot = 0, dividendTot = 0;
        for (float divid : divisor) {
            divisorTot *= divid;
        }
        for (float divi : divisor) {
            divisorTot *= divi;
        }
        quotient = dividendTot / divisorTot;
        return quotient;
    }

}