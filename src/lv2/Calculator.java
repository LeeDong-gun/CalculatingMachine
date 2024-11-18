package lv2;

import java.util.ArrayList;;

public class Calculator {

    private ArrayList<Double> answerList;

    public ArrayList<Double> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(ArrayList<Double> setOp) {
        this.answerList = setOp;
    }

    public Calculator() {
        this.answerList = new ArrayList<>();
    }


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
                    answer = (double) firstNumber / secondNumber;
                    break;
                }
            default:
                System.out.println("잘못된 연산자 입니다.");
        }
        this.answerList.add(answer);
        return answer;
    }
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

