public class MinElement {
    public static void main(String[] args) {
        int [] a= {45,90,55,88,97,123,77};
        int ans = minElement(a);

        System.out.println(ans);
    }

    static int minElement(int[]a)
    {
        int min = Integer.MAX_VALUE;
        for (int elem : a) {
            if(elem < min)
                min = elem;
        }
        return min;
    }
}
