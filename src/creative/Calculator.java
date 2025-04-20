package creative;
import java.util.Scanner;

// 계산기 클래스
public class Calculator {
    // 속성(필드)
    private double num1;
    private double num2;
    private String operator;

    // 생성자
    public Calculator(double num1, double num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    // 기능(메서드): 덧셈
    public double add() {
        return num1 + num2;
    }

    // 기능(메서드): 뺄셈
    public double subtract() {
        return num1 - num2;
    }

    // 기능(메서드): 곱셈
    public double multiply() {
        return num1 * num2;
    }

    // 기능(메서드): 나눗셈
    public double divide() {
        if (num2 == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return num1 / num2;
    }

    // 기능(메서드): 연산자에 따라 결과 계산
    public double calculate() {
        switch (operator) {
            case "+":
                return add();
            case "-":
                return subtract();
            case "*":
                return multiply();
            case "/":
                return divide();
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");
        }
    }
}

// 메인 클래스
