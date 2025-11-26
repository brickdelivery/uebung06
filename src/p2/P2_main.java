package p2;

public class P2_main {

    public static void main(String[] args) {
        System.out.print(pairwiseDifferent(new int[]{1, 2, 3, 4, 6, 7, 7}));
    }

    public static boolean pairwiseDifferent(int[] someNumbers) {
        int[] check = new int[someNumbers.length];
        int k = 0;
        for (int i : someNumbers) {
            for (int j : check) {
                if (j == i)
                    return false;
            }
            check[k] = someNumbers[k];
            k++;
        }
        return true;
    }
}
