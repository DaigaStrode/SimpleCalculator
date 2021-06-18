package com.company;

public class Main {

    public static void main(String[] args) {
   //Number declarations
        int firstNumber;
        int secondNumber;
        int answer;

   //Number initialized
        firstNumber = 5;
        secondNumber = 7;
        answer = 0;

   //Mathematical operator
        String operator = "*";

        if(operator.equals("+")) {
            answer = firstNumber + secondNumber;
        } else if (operator.equals("-")) {
            answer = firstNumber - secondNumber;
        }
// do if statements to multiplication and division

        else if (operator.equals("*")) {
            answer = firstNumber * secondNumber;
        } else if (operator.equals("/")) {
            answer = firstNumber / secondNumber;
        }

        System.out.println(answer);



    }
}
