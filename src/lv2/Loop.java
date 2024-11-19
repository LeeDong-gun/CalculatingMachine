package lv2;

import java.util.Scanner;

public class Loop {
    public void loop (){
        // 멤버 변수 및 인스턴스화
        Scanner sc = new Scanner(System.in);
        String exit = "";
        // 반복문 do - while 문 시작
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
            // Calculator 클래스의 cc 메서드를 불러오기 위한 인스턴스
            Calculator calculator = new Calculator();
            // cc 메서드 사용
            double answer = calculator.cc(operator, firstNumber, secondNumber);

            System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + answer);

            System.out.println("결과 값이 저장 되었습니다.");
            System.out.println();
            System.out.print("결과 값을 삭제 하시겠습니까? (yes or no) :");
            String input = sc.nextLine();
            calculator.remove(input);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            exit = sc.nextLine();
            // exit 문자열을 받았을 때 반복문 탈출
        } while (!exit.equalsIgnoreCase("exit"));

        System.out.println("계산기를 종료합니다!");
        sc.close();
    }
}
