public class EvenNumberDigitInArray {

    public static void main(String[] args) {
        int [] a = {2345,556,456,32,4567,4578,55 ,4567882,536};
        int ans  =countEvenDigits(a);
        System.out.println(ans);

    }
    static int countEvenDigits(int [] a)
    {
        int totalEvenDigit =0;
        for(int i :a)
        {
            int count =0;
            while(i>0)
            {
                count++;
                i=i/10;
            }
            boolean flag = evenDigit(count);
            if(flag)
                totalEvenDigit++;
        }

        return totalEvenDigit;
    }

    static  boolean evenDigit(int number)
    {
        if(number % 2 == 0)
            return true;

        return false;
    }
}
