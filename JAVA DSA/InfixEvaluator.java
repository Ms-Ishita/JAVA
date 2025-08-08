import java.util.*;

public class InfixEvaluator {

    public static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        else if (op == '*' || op == '/') return 2;
        else return 0;
    }

    public static int applyOp(int a, int b, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
        }
        return 0;
    }

    public static int evaluate(String exp) {
        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            // Skip whitespaces
            if (ch == ' ') continue;

            // If digit, parse full number
            if (Character.isDigit(ch)) {
                int val = 0;
                while (i < exp.length() && Character.isDigit(exp.charAt(i))) {
                    val = val * 10 + (exp.charAt(i) - '0');
                    i++;
                }
                values.push(val);
                i--; // To counter outer loop increment
            }

            // If open bracket
            else if (ch == '(') {
                ops.push(ch);
            }

            // If closing bracket, solve entire bracket
            else if (ch == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    int b = values.pop();
                    int a = values.pop();
                    char op = ops.pop();
                    values.push(applyOp(a, b, op));
                }
                ops.pop(); // remove '('
            }

            // If operator
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(ch)) {
                    int b = values.pop();
                    int a = values.pop();
                    char op = ops.pop();
                    values.push(applyOp(a, b, op));
                }
                ops.push(ch);
            }
        }

        // Final evaluation
        while (!ops.isEmpty()) {
            int b = values.pop();
            int a = values.pop();
            char op = ops.pop();
            values.push(applyOp(a, b, op));
        }

        return values.pop();
    }

    public static void main(String[] args) {
        String expr = "2 + 3 * (4 - 1)";
        System.out.println("Result: " + evaluate(expr));
    }
}
