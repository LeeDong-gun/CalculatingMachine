package lv2;

import java.util.ArrayList;;

public class Calculator {
    // answerList 라는 컬렉션 생성
    private ArrayList<Double> answerList;

    // private의 컬렉션은 다른 클래스에서 사용할 수 있도록 getter 생성
    public ArrayList<Double> getAnswerList() {
        return answerList;
    }
    // private의 컬렉션은 다른 클래스에서 수정할 수 있도록  setter 생성
    public void setAnswerList(ArrayList<Double> setOp) {
        this.answerList = setOp;
    }
    // 생성자
    public Calculator() {
        this.answerList = new ArrayList<>();
    }

    // 연산 기능
    public double cc(char operator, int firstNumber, int secondNumber) {
        double answer = 0;
        switch (operator) {
            case '+':
                answer = Add.add(firstNumber, secondNumber);
                break;
            case '-':
                answer = Sub.sub(firstNumber,secondNumber);
                break;
            case '*':
                answer = Mul.mul(firstNumber, secondNumber);
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    answer = Div.div(firstNumber, secondNumber);
                    break;
                }
            default:
                System.out.println("잘못된 연산자 입니다.");
        }
        // 연산 결과 값을 컬렉션에 추가
        this.answerList.add(answer);
        return answer;
    }
    // 연산결과가 들어있는 컬렉션에서 삭제 할것인지 정하는 기능
    public void remove (String input) {
        switch (input) {
            case "yes":
                answerList.remove(0);
                System.out.println("삭제 되었습니다.");
            case "no":
                System.out.println("삭제되지 않았습니다.");
        }
    }
}

