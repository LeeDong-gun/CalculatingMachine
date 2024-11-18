package lv2;

import java.util.Scanner;

public class Loop {
    public void loop (){
        Scanner sc = new Scanner(System.in);
        String exit = "";
        do {
            // 입력받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("사칙연산(+, -, *, /) 기호를 입력하세요: ");
            char operator = sc.nextLine().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = sc.nextInt();
            sc.nextLine();

            Calculator calculator = new Calculator();

            double answer = calculator.cc(operator, firstNumber, secondNumber);

            System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + answer);

            System.out.println("결과 값이 저장 되었습니다.");
            System.out.println();
            System.out.print("결과 값을 삭제 하시겠습니까? (yes or no) :");
            String input = sc.nextLine();
            calculator.remove(input);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            exit = sc.nextLine();
        } while (!exit.equalsIgnoreCase("exit"));

        System.out.println("계산기를 종료합니다!");
        sc.close();
    }
}
