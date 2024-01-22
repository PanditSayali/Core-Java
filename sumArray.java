public class sumArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int sum = 0;
        System.out.println("Element of array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum of Array:" + sum);

    }
}