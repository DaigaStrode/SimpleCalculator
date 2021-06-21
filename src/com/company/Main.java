package com.company;

public class Main {

    public static void main(String[] args) {
   //Number declarations
        double firstNumber;
        int secondNumber;
        double answer;

   //Number initialized
        firstNumber = 22;
        secondNumber = 7;
        answer = 0;

   //Mathematical operator
        String operator = "/";

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

//        System.out.println(answer);
        int five = 5;
        five += 1; // is the same as five = five + 1

        //post increment means you increse by one AFTER
        //you use the value
//        System.out.println("post increment value" + five++);

        //pre increment means you increse by one before
        //you use the value
//        System.out.println("Pre increment value" + ++five); //this only works on increment by one

        boolean sixLessThan = 6 < 8;
        boolean fiveGreaterThan = 5 > 9;

//        && - AND only works if both statements are true
//        || - OR works if either is true, only gives false if both are false
//        ! - NOT
//        != - NOT EQUALS checks for non equality
//        == EQUALS checks for equality
//        >=  GREATER THAN EQUALS
//        <= LESS THAN EQUALS
//        % - module returns the remainder


//       if (6 < 8 == 5 > 8) {
 //           System.out.println("EQUALS works");
//        } else {
 //           System.out.println("EQUALS was skipped");
 //       }


        //Loops
        // for loop - final times for the loop to run
        // while loop - not known times for running, but when a condition is met
        // do loop - before checking the while it does the do
        for(int i = 10; i > 0; i--)

    {
 //       System.out.println("Current value of i: " + i);
    }
        int counter = 1;
        while (counter <= 10) {
//            System.out.println(counter);
            counter++;
        }

        do {
//            System.out.println(counter);
            counter++;
        } while(counter <= 10);

        for(int i = 1; i <= 10; i++) {
            //Check for even numbers
//            System.out.println(i + " module by 2 = " + i % 2);
            if (i % 2 == 0) {
//                System.out.println("Current even number: " + i);
            } else {
//                System.out.println("Current odd number: " + i);
            }

        }

//        System.out.println(Math.pow(2, 4));
//        System.out.println(Math.min(5, 200));

        int minimum = Math.min (5, 200);
        System.out.println(minimum);











    }
}
