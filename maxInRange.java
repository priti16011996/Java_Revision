import java.util.Scanner;

public class maxInRange {
    public static void main(String[] args) {
        int [] a= {45,90,55,88,97,123,77};
        Scanner sc = new Scanner(System.in);
        int start  =  sc.nextInt();
        int  end = sc.nextInt();

        int ans = maxElement(a,start,end);

        System.out.println(ans);
    }

    static int maxElement(int[]a ,int start, int end)
    {
        if(start>end)
            return -1;

        int max = Integer.MIN_VALUE;
        for (int i=start; i<=end; i++) {
            if(max <  a[i])
                max = a[i];
        }
        return max;
    }
}
