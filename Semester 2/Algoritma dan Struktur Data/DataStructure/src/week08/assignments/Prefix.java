package week8.assignments;

public class Prefix {

    int n, top; // declare n, top
    char stack[]; // declare stack[]

    public Prefix(int total) { // constructor
        n = total; // initialize n
        top = -1; // initialize top
        stack = new char[n]; // instantiate stack
        push('('); // push '('
    }

    public void push(char c) { // method to push c
        top++; // top increases
        stack[top] = c; // initialize stack[top]
    }

    public char pop() { // method to pop the top of stack
        char item = stack[top]; // declare + initialize item
        top--; // top decreases
        return item; // return item
    }

    public boolean isOperand(char c) { // method to check whether c is operand or not
        // if c is operand, return true. If not, return false
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == '.';
    }

    public boolean isOperator(char c) { // method to check whether c is operator or not
        // if c is operator, return true. If not, return false
        return c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+';
    }

    public int precedence(char c) { // method to check the precedence of operator
        switch (c) { // selection to check the precedence of operator
            case '^': // if c = ^
                return 3; // return 3 (highest)
            case '%': // if c = %
                return 2; // return 2
            case '/': // if c = /
                return 2; // return 2
            case '*': // if c = *
                return 2; // return 2
            case '-': // if c = -
                return 1; // return 1
            case '+': // if c = +
                return 1; // return 1
            default: // if no one of them
                return 0; // return 0
        }
    }

    public String convert(String Q) { // method to convert the expression
        String P = ""; // declare and initialize P
        char c; // declare c
        for (int i = 0; i < n + 1; i++) { // iteration to check the expression
            c = Q.charAt(i); // c is charAt(i) from Q
            if (isOperand(c)) { // if c is operand
                P = P + c; // add the sentence P with c
            }
            if (c == '(') { // if c is '('
                push(c); // push c to stack
            }
            if (c == ')') { // if c is ')' 
                while (stack[top] != '(') { // iteration to pop the top of stack
                    P = P + pop(); // add the sentence P with pop()
                }
                char temp = pop(); // pop '('
            }
            if (isOperator(c)) { // if c is operator
                // iteration to pop the stack if precedence(stack[top)) >= precedence(c)
                while (precedence(stack[top]) >= precedence(c)) {
                    P = P + pop(); // add the sentence P with pop()
                }
                push(c); // push c
            }
        }
        P = reverseExpression(P); // reserve the expression
        return P; // return P as prefix
    }

    public String reverseExpression(String Q) { // method to reserve expression
        String temp = Q; // declare and initialize Q
        Q = ""; // reset Q to empty string
        for (int i = temp.length() - 1; i >= 0; i--) { // iteration to reserve
            char x = temp.charAt(i); // x is charAt(i) from x
            if (x == '(') { // if x == (
                x = ')'; // x is ')'
            } else if (x == ')') { // else if x == )
                x = '('; // x is '('
            }
            Q = Q + x; // add Q with x
        }
        return Q; // return Q
    }
}
