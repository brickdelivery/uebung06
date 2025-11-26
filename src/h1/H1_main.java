package h1;

public class H1_main {
    public static void main(String[] args) {
        //System.out.println(isMirrorArray(new int[]{4, 3, 2}, new int[]{2, 3, 4}));
    }

    public static boolean isMirrorArray(int[] a, int[] b) {
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[b.length - 1 - i])
                    return false;

            }
        } else
            return false;
        return true;
    }
}
