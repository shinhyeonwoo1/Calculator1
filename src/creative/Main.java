package creative;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("계산기");



        while (true) {
            System.out.print("\n첫 번째 숫자 입력 (또는 'exit'): ");
            String input = scanner.next();


            if (input.equalsIgnoreCase("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }

            double num1;
            try {
                num1 = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("잘못된 숫자입니다.");
                continue;
            }

            System.out.print("연산자 입력 (+, -, *, /): ");
            String operator = scanner.next();

            System.out.print("두 번째 숫자 입력: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("잘못된 숫자입니다.");
                scanner.next();
                continue;
            }
            double num2 = scanner.nextDouble();

            double result = 0;
            boolean valid = true;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                        valid = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("올바르지 않은 연산자입니다.");
                    valid = false;
            }

            if (valid) {
                System.out.println("결과: " + result);
            }
        }


    }
}


