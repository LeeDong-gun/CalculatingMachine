package lv1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit = "";
        do {
            // 입력받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = sc.nextInt();
            sc.nextLine();

            System.out.println("사칙연산(+, -, *, /) 기호를 입력하세요: ");
            char operator = sc.nextLine().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = sc.nextInt();

            double answer = 0;

            switch (operator) {
                case '+':
                    answer = firstNumber + secondNumber;
                    break;
                case '-':
                    answer = firstNumber - secondNumber;
                    break;
                case '*':
                    answer = firstNumber * secondNumber;
                    break;
                case '/':
                    if (secondNumber == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                    } else {
                        answer = firstNumber / secondNumber;
                    }
                default:
                    System.out.println("잘못된 연산자 입니다.");
            }
            System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + answer);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            sc.nextLine();
            exit = sc.nextLine();
        } while (!exit.equalsIgnoreCase("exit"));

        System.out.println("계산기를 종료합니다!");
        sc.close();
    }
}
