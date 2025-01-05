import java.sql.SQLOutput;
import java.util.Scanner;

public class ElementExistInArray {
    public static void main(String[] args) {
        int [] arr = {15,16,26,56,67};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element for search");
        int target = sc.nextInt();
        int result = ElementExistAtIndex(arr,target);
        if(result == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element exist at index : "+result);
        }

    }

    static int ElementExistAtIndex(int[] a,int element )
    {
        for(int i=0; i<a.length; i++)
        {
            if(a[i] == element)
            {
                return i;
            }
        }
        return -1;
    }
}
