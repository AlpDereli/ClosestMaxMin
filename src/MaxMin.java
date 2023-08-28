import java.util.Scanner;
import java.util.Arrays;
public class MaxMin {
    public static void main(String[] args) {
        Scanner take = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = take.nextInt();
        int[] arr = {12, -43, 45, 6954, 24, 75, 1, 0, 56, -24, -2};
        Arrays.sort(arr);
        for (int  i = 0; i<arr.length;i++)
        {
            if (arr[i]>=num)
            {
                System.out.println(arr[i] +  " is the closest bigger number");
                if (i-1>=0)
                {
                    System.out.println(arr[i-1] + " is the closest smaller number");
                }
                else
                {
                    System.out.println("It is the smallest number");
                }
                break;
            }
            
        }
    }
}
