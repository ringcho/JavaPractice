package ch13;

import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {
        System.out.println("두 수를 받아 더 큰 수를 출력하시오");
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int maxNum = (num1>num2) ? num1 : num2;
        System.out.println(maxNum);
    }
}
