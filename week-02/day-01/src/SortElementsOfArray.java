import com.sun.jmx.remote.internal.ArrayNotificationBuffer;

import java.util.Arrays;

public class SortElementsOfArray {
    public static void main(String[] args) {

        int[] a = {23, 50, 11, 8};  //this is the Array
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


        for (int i = 0; i < a.length; i++)
        {
            for (int j = i +1; j < a.length; j++)
            {
                if (a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i = 0; i < a.length ; i++)
        {
            System.out.print(a[i] + ",");
        }
    }
}
