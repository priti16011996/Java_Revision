import java.util.Scanner;

public class mininRange {
    public static void main(String[] args) {
        int [] a= {45,90,55,88,97,123,77};
        Scanner sc = new Scanner(System.in);
        int start  =  sc.nextInt();
        int  end = sc.nextInt();

        int ans = minElement(a,start,end);

        System.out.println(ans);
    }

    static int minElement(int[]a ,int start, int end)
    {
        if(start>end)
            return -1;

        int min = Integer.MAX_VALUE;
        for (int i=start; i<=end; i++) {
            if(min >  a[i])
                min = a[i];
        }
        return min;
    }
}
