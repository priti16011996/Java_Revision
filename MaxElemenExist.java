import java.util.Scanner;

public class MaxElemenExist {
    public static void main(String[] args) {
        int [] a= {45,90,55,88,97,123,77};
        int ans = maxElement(a);

        System.out.println(ans);
    }

    static int maxElement(int[]a)
    {
        int max = Integer.MIN_VALUE;
        for (int elem : a) {
            if(max <  elem)
                max = elem;
        }
        return max;
    }

}
