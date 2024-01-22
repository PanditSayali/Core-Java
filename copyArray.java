
public class copyArray {

    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 5 };
        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println("Element of array1 :");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("Element of array2 :");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }

    }
}