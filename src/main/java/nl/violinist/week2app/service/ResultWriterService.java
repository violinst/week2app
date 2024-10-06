package nl.violinist.week2app.service;

import nl.violinist.week2app._main.Main;
import nl.violinist.week2app.util.Calculator;

public class ResultWriterService {
    public static void print1(int num1, int num2, String x, int res1) {

        System.out.println("" + num1 + num2 + " Sum: " + res1);
    }
    public static void print2(int num1, int num2, String x, int res2) {

        System.out.println(  "" + num1 + num2 +" Difference: "+ res2);
    }
    public static void print3(int num1, int num2, String x, int res3){

        System.out.println(  "" + num1 + num2 +" Multiply: "+ res3);

    }

}
