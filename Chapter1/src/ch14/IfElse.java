package ch14;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        System.out.println("아이의 나이를 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int charge;
        if (age>8 && age<20){
            System.out.println("학교에 갈 수 있습니다.");
        }
        else {
            System.out.println("입학 불가");
        }
        System.out.println("노는게 제일 좋아");
        if (age<8){
            charge = 1000;
            System.out.println("미 취학");
        } else if (age < 15) {
            charge = 2000;
            System.out.println("초등");
        } else if (age < 20) {
            charge = 3000;
            System.out.println("청소년");
        } else {
            charge = 5000;
            System.out.println("성인");
        }
        System.out.println("놀이 공원 요금은 " + charge + " 원 입니다");
    }
}
