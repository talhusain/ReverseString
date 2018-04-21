import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter String to reverse");
        String input = scan.nextLine();
        String rev = "";

        int len = input.length();

        for(int i = len - 1; i >=0; i--)

            rev = rev + input.charAt(i);

        System.out.println(input);
        System.out.println(rev);
    }
}
