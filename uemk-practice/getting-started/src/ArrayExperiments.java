import java.util.Arrays;

public class ArrayExperiments {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello arrays!");
        int[] a = new int[] {0, 1, 2, 3, 4, 5};
        int[] b = a;
        int[] c = Arrays.copyOf(a, a.length);

        a[3] = 13;
        b[4] = 14;
        c[5] = 15;

        for (int element : a)
            System.out.print(element + " ");
        System.out.println();


        for (int element : b)
            System.out.print(element + " ");
        System.out.println();
        for (int element : c)
            System.out.print(element + " ");

    }
}
