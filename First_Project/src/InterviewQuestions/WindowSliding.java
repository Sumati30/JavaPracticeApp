package InterviewQuestions;

import java.util.*;

public class WindowSliding {

    static int max(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        return max;
    }

    static int min(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        return min;
    }

    static int sum(int a[], int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += a[i];
        }
        return sum;
    }

    static ArrayList<Integer> slidingWindowMax(int[] a, int k) {
        ArrayList<Integer> maxInt = new ArrayList<>();
        for (int i = 0; i <= a.length - k; i++) {
            int max = a[i];
            for (int j = i; j < i + k; j++) {
                if (max < a[j]) {
                    max = a[j];
                }
            }
            maxInt.add(max);
        }
        return maxInt;
    }

    static ArrayList<Integer> slidingWindowSum(int a[], int k) {
        ArrayList<Integer> windowSum = new ArrayList<>();
        for (int i = 0; i <= a.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += a[j];
            }
            windowSum.add(sum);
        }
        return windowSum;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        int[] a = {6, 4, 5, 6, 0, 2, 3};

        ArrayList<Integer> sumList = slidingWindowSum(a, 3);
        ArrayList<Integer> maxList = slidingWindowMax(a, 3);

        System.out.println("Sliding Window Sum: " + sumList);
        System.out.println("Sliding Window Max: " + maxList);
        System.out.println("Minimum: " + min(a));
        System.out.println("Maximum: " + max(a));
    }
}
