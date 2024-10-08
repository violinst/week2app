package nl.violinist.week2app._main;

import nl.violinist.week2app.service.ResultWriterService;
import nl.violinist.week2app.util.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);
        int num1 = cal.nextInt();
        int num2 = cal.nextInt();
        int res1 = Calculator.sum(num1, num2);
        int res2 = Calculator.subtraction(num1, num2);
        int res3 = Calculator.multiplication(num1, num2);
        ResultWriterService.print("+", num1, num2, res1);
        ResultWriterService.print("-", num1, num2, res2);
        ResultWriterService.print("*", num1, num2, res3);
    }
}
