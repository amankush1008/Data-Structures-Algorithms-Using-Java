package stack;

import java.util.Stack;

public class PostfixEvaluator {

    // Method to evaluate a postfix expression
    public static int evaluatePostfix(String expression) {
        // Stack to store operands
        Stack<Integer> stack = new Stack<>();

        // Split the expression by spaces to get tokens
        String[] tokens = expression.split("\\s+");
//        System.out.println(tokens);

        // Iterate through each token
        for (String token : tokens) {
            // Check if the token is an operand
            if (isNumeric(token)) {
                // Push the operand to the stack
                stack.push(Integer.parseInt(token));
            } else {
                // The token is an operator, pop two operands from stack
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                
                // Perform the operation and push the result back to the stack
                switch (token) {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
            }
        }

        // The result will be the only element left in the stack
        return stack.pop();
    }

    // Helper method to check if a string is numeric
    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Main method to test the evaluatePostfix function
    public static void main(String[] args) {
        String expression = "2 3 1 * + 9 -"; // Example postfix expression
        int result = evaluatePostfix(expression);
        System.out.println("The result of the postfix expression is: " + result);
    }
}
