package p3;

public class P3_main {
    public static void main(String[] args) {
        System.out.println(methode(new int[]{5})); // mind ein eintrag
        System.out.println(methode(new int[]{-6, 7})); // genau zwei
        System.out.println(methode(new int[]{1, -2, 3})); // mehr als zwei
        System.out.println(methode(new int[]{-3, 3, 4})); // pos/neg
        System.out.println(methode(new int[]{5, 5, -5})); // nicht bestimmbar
        System.out.println("new " + methodeNew(new int[]{5}));
        System.out.println("new " + methodeNew(new int[]{-6,7}));
        System.out.println("new " + methodeNew(new int[]{1,-2,3}));
        System.out.println("new " + methodeNew(new int[]{-3,3,4}));
        System.out.println("new " + methodeNew(new int[]{5,5,-5}));

    }

    public static int methode(int[] a) {
        int max = -1;
        int k = a.length - 1;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (a[j] > a[i]) {
                    max = a[j];
                }
            }
        }
        return max;
    }

    public static int methodeNew(int[] a) {
        int max = -1;
        int secondMax = max;
        for (int i : a) {
            if (betrag(i) != max) {
                secondMax = max;
            }
            if (betrag(i) > max) {
                max = i;
            }
        }
        return secondMax;
    }

    public static int betrag (int n) {
        if (n < 0) return n*-1;
        return n;
    }
}
