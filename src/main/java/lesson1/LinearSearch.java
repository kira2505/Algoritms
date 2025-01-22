package lesson1;

public class LinearSearch {

    public static void main(String[] args) {
        int[] ints = {1,3,4,567,68,7};
        System.out.println(findElement(ints, 7));
    }

    private static boolean findElement(int[] ints,int target) {
        for (int i = 0; i < ints.length; i++) {
            if(ints[i] == target) {
                return true;
            }
        }
        return false;
    }
}
