package trash;

import java.util.Stack;

public class validadeExpression {
    String validacao;

    public String getValidacao() {
        return validacao;
    }
    
    
    public validadeExpression(String expression) {
        createTree(expression);
    }
    
    public static boolean tableaux(Expression expression) {
        if (expression.isNegated) {
            return !tableaux(expression.left);
        } else if (expression.connective == "∧") {
            return tableaux(expression.left) && tableaux(expression.right); 
        } else if (expression.connective == "v") {
            return tableaux(expression.left) || tableaux(expression.right); 
        } else if (expression.connective == "→") {
            return !tableaux(expression.left) || tableaux(expression.right); 
        } else if (expression.connective == "↔") {
            return !tableaux(expression.left) == tableaux(expression.right); 
        } else {
            return false;
        }
    }
    
    public static Expression createTree(String expression) {
     Stack<Expression> stack = new Stack<>();
        Expression root = null;
        boolean isNegated = false;
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            if (ch == '(') {
                stack.push(root);
                root = null;
                isNegated = false;
            } else if (ch == ')') {
                Expression node = stack.pop();
                
                if (root == null) {
                    root = node;
                } else if (node.connective.equals("∧")) {
                    node.left = root;
                    node.right = stack.pop();
                    root = node;
                } else if (node.connective.equals("v")) {
                    node.left = root;
                    node.right = stack.pop();
                    root = node;
                } else if (node.connective.equals("→")) {
                    node.right = root;
                    node.left = stack.pop();
                    root = node;
                } else if (node.connective.equals("↔")) {
                    node.left = root;
                    node.right = stack.pop();
                    root = node;
                }
            } else if (ch == '~') {
                isNegated = true;
            } else if (ch == '∧') {
                root = new Expression("∧", false);
            } else if (ch == 'v') {
                root = new Expression("v", false);
            } else if (ch == '→') {
                root = new Expression("→", false);
            } else if (ch == '↔') {
                root = new Expression("↔", false);
            } else {
                root = new Expression(Character.toString(ch), isNegated);
                isNegated = false;
            }
        }
        
        return root;
    }
}
