package com.ll.Lv0.TDDTEST;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args){
        System.out.println(new Polynomial("3 + 3").calc());
    }
}

class Polynomial {
    String numbers;
    Polynomial(String numbers){
        this.numbers = numbers;
    }

    public int calc(){
        int result = 0;
        numbers = numbers.replaceAll(" ", "");

        for(int i = 0 ; i < numbers.length(); i ++){
            if(Character.isDigit(numbers.charAt(i))){
                if(Character.isDigit(numbers.charAt(i+1))){
                    int a = numbers.charAt(i) - '0';
                    int b = numbers.charAt(i+1) - '0';
                    result = 10 * a + b;
                }
                else{
                    result = numbers.charAt(i) - '0';
                }
            }
            else{
                result += numbers.charAt(i+1) - '0';
                break;
            }
        }
        return result;
    }
}




//public class Calculator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter expression: ");
//        String expression = scanner.nextLine();
//
//        double result = evaluate(expression);
//
//        System.out.println("Result: " + result);
//    }
//
//    public static double evaluate(String expression) {
//        // Remove all white spaces from the expression
//        expression = expression.replaceAll("\\s+", "");
//
//        // Create a stack to hold the numbers and operators
//        Stack<Double> numbers = new Stack<>();
//        Stack<Character> operators = new Stack<>();
//
//        // Loop through the expression
//        for (int i = 0; i < expression.length(); i++) {
//            char ch = expression.charAt(i);
//
//            // If the character is a digit, extract the entire number
//            if (Character.isDigit(ch)) {
//                int j = i;
//                while (j < expression.length() && Character.isDigit(expression.charAt(j))) {
//                    j++;
//                }
//                double num = Double.parseDouble(expression.substring(i, j));
//                numbers.push(num);
//                i = j - 1;
//            }
//            // If the character is an opening parenthesis, push it to the operators stack
//            else if (ch == '(') {
//                operators.push(ch);
//            }
//            // If the character is a closing parenthesis, evaluate the expression within the parentheses
//            // and push the result to the numbers stack
//            else if (ch == ')') {
//                while (operators.peek() != '(') {
//                    double num2 = numbers.pop();
//                    double num1 = numbers.pop();
//                    char op = operators.pop();
//                    double result = applyOperator(num1, num2, op);
//                    numbers.push(result);
//                }
//                operators.pop(); // Pop the opening parenthesis
//            }
//            // If the character is an operator, push it to the operators stack
//            else if (isOperator(ch)) {
//                while (!operators.isEmpty() && hasPrecedence(ch, operators.peek())) {
//                    double num2 = numbers.pop();
//                    double num1 = numbers.pop();
//                    char op = operators.pop();
//                    double result = applyOperator(num1, num2, op);
//                    numbers.push(result);
//                }
//                operators.push(ch);
//            }
//        }
//
//        // Evaluate any remaining operators
//        while (!operators.isEmpty()) {
//            double num2 = numbers.pop();
//            double num1 = numbers.pop();
//            char op = operators.pop();
//            double result = applyOperator(num1, num2, op);
//            numbers.push(result);
//        }
//
//        // The final result is the top element of the numbers stack
//        return numbers.pop();
//    }
//
//    public static boolean isOperator(char ch) {
//        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
//    }
//
//    public static boolean hasPrecedence(char op1, char op2) {
//        if (op2 == '(' || op2 == ')') {
//            return false;
//        }
//        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
//            return false;
//        }
//        return true;
//    }
//
//    public static double applyOperator(double num1, double num2, char op) {
//        switch (op) {
//            case '+':
//                return num1 + num2;
//            case '-':
//                return num1 - num2;
//            case '*':
//                return num1 * num2;
//            case '/':
//                return num1 / num2;
//            default:
//                throw new IllegalArgumentException("Invalid operator");
//        }
//    }
//}

