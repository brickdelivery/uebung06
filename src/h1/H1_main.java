package h1;

public class H1_main {
    public static void main(String[] args) {
        //System.out.println(isMirrorArray(new int[]{4, 3, 2}, new int[]{2, 3, 4}));
    }

    public static boolean isMirrorArray(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[arr2.length - 1 - i])
                    return false;
            }
        } else
            return false;
        return true;
    }
}
