package lesson1;

public class TwoSumExample {

    public static void main(String[] args) {
        int[] ints = {1, 3, 5, 7, 9, 15};
        int l = ints[0];
        int r = ints.length - 1;
        while (l < r) {
            int one = ints[r];
            int two = ints[l];
            int sum = one + two;
            if (sum == 10) {
                break;

            }
            System.out.println(one + two);

            if (sum > 10) {
                r--;
            } else {
                l++;
            }
        }
    }
}
