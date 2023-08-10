package MidSem;

import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your index number: ");
        String indexNumber = scanner.nextLine();

        String lastChar = String.valueOf(indexNumber.charAt(indexNumber.length() - 1));
        System.out.println(lastChar);
        System.out.println("\\");
    }
}
