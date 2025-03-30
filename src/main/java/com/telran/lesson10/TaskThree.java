package com.telran.lesson10;

public class TaskThree {

    public static void main(String[] args) {
        int[] array = {1, 0, 1, 1, 0, 1};
        System.out.println(maxCountOfElements(array));
    }

    private static int maxCountOfElements(int[] array) {
        int zero = 0;
        int max = 0;
        int start = 0;
        for (int i = 0; i < array.length; i++) {
//            int currMax = i - start + 1;
//            if(currMax > max) {
//                max = currMax;
//            }
            if(array[i] == 0){
                zero++;
            }
            while (zero> 1) {
                if(array[start] == 0) {
                    zero--;
                }
                start++;
            }
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
}
