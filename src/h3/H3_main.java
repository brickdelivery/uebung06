package h3;

public class H3_main {
    public static void main(String[] args) {

    }

    public static boolean compareArraysValues(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i : arr1) {
                if (countInt(i, arr1) != countInt(i, arr2))
                    return false;
            }
        } else
            return false;
        return true;
    }

    public static int countInt(int n, int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i == n)
                count++;
        }
        return count;
    }
}
