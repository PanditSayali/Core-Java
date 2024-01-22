public class maxOfArray {
    public static void main(String[] args)

    {
        int a[] = { 1, 4, 67, 6, 7, 9 };
        int max = a[0];
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] > max) 
            {
                max = a[i];
            }
        }
        System.out.println("maximum element of array : " + max);
    }
}