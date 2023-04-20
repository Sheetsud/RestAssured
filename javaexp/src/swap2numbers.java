import java.util.Scanner;

public class swap2numbers {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Two numbers swaped are");
        System.out.println(a);
        System.out.println(b);

    }
}
