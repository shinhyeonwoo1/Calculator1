package creative;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.print("첫 번째 숫자 입력: ");
        double num1 = scanner.nextDouble();

        System.out.print("연산자 입력 (+, -, *, /): ");
        String operator = scanner.next();

        System.out.print("두 번째 숫자 입력: ");
        double num2 = scanner.nextDouble();

        try {
            Calculator calculator = new Calculator(num1, num2, operator);

            double result = calculator.calculate();
            System.out.println("결과: " + result);

        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        }

        scanner.close();
    }
}

