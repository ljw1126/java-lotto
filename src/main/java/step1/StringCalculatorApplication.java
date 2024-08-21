package step1;

import step1.calculator.StringCalculator;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringCalculatorApplication {
    private static final Logger LOGGER = Logger.getLogger(StringCalculatorApplication.class.getName());

    public static void main(String[] args) {
        LOGGER.info("사칙 연산식을 입력해주세요(공백 기준 분리)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringCalculator stringCalculator = new StringCalculator();
        if (LOGGER.isLoggable(Level.INFO)) {
            int result = stringCalculator.evaluate(input);
            LOGGER.info(String.valueOf(result));
        }
    }
}
