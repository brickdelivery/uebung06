package h2;

public class H2_main {
    public static void main(String[] args) {

    }

    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
