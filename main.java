import java.util.Scanner;

public class main
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your postcode: ");
        String postcode= sc.nextLine();
        System.out.println("your postcode in uppercase: " + postcode.toUpperCase());
    }
}
