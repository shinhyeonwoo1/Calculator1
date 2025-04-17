package creative;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요:");
        int a = scanner.nextByte();
        System.out.println("두번째 숫자를 입력하세요:");
        double b = scanner.nextByte();

        double div = a / b;
        System.out.println("결과값:" + div);


    }
}
