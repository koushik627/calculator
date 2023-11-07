package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        logger.info("Start of Execution");
        int option = 0;
        while(true) {
            System.out.println("-----Calculator Application----\n" +
                    "Choose an option\n" +
                    "1. Addition\n" +
                    "2. Multiplication\n" +
                    "3. Subtraction\n" +
                    "4. Division\n" +
                    "5. Exit");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();
            if(option == 5){
                logger.info("End of Execution");
                System.exit(0);
            }

            System.out.println("Enter the first number: ");
            int num1 = input.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = input.nextInt();
            switch(option){
                case 1:
                    logger.info("START OPERATION: Add");
                    System.out.println("--------Result is--------\n" +
                            num1 + " + " + num2 + " = " + add(num1, num2));
                    logger.info("END OPERATION: Add");
                    break;
                case 2:
                    logger.info("START OPERATION: Mul");
                    System.out.println("--------Result is--------\n" +
                            num1 + " - " + num2 + " = " + mul(num1, num2));
                    logger.info("END OPERATION: Sub");
                    break;
                case 3:
                    logger.info("START OPERATION: Sub");
                    System.out.println("--------Result is--------\n" +
                            num1 + " * " + num2 + " = " + sub(num1, num2));
                    logger.info("END OPERATION: Mul");
                    break;
                case 4:
                    logger.info("START OPERATION: Div");
                    System.out.println("--------Result is--------\n" +
                            num1 + " / " + num2 + " = " + div(num1, num2));
                    logger.info("END OPERATION: Div");
                    break;

                default:
                    logger.warn("Invalid input");
            }
        }
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int div(int a, int b){
        return a/b;
    }
}
//comment 1 2