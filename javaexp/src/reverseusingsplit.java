import java.util.Scanner;

public class reverseusingsplit {
    public static void main(String args[])
    {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        str = sc.nextLine();
        String[] answer=str.split("");
        for(int i= answer.length-1;i>=0;i--)
        {
            System.out.println("Reverse string " + answer[i]);
        }

    }
}
