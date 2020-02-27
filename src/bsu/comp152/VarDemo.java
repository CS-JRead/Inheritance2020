package bsu.comp152;

import java.util.Scanner;

public class VarDemo {
    public static void main(String[] args) {
        var inputReader = new Scanner(System.in);
        var str1 = "Yes";
        System.out.println("Enter value:");
        var str2 = inputReader.next();
        if (str1==str2)
            System.out.println("It worked");
        else
            System.out.println("No");
    }
}
