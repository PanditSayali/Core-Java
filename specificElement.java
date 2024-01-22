public class specificElement {

    public static void main(String[] args) {
        int a[] = { 34, 55, 77, 9, 3 };
        System.out.println("Element of array");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("specific element: " + 77 + " index is" + Findd.indexPosition(a, 77));

    }
}

class Findd {
    public static int indexPosition(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x)
                return i;
        }
        return -1;
    }
}