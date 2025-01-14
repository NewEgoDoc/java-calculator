/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.programmers.java;

import com.programmers.java.calculator.Calculator;
import com.programmers.java.calculator.Console;
import com.programmers.java.calculator.engine.Input;
import com.programmers.java.calculator.engine.Output;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Input input = new Console();
        Output output = new Console();
        new Calculator(input,output,new ArrayList<>()).run();
    }
}
