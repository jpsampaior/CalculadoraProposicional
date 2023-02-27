package calculadoraLogica;

import java.util.Stack;

public class Operations {
    public boolean solveEquation(String equation, boolean pValue, boolean qValue, boolean rValue) {
        Stack<Boolean> operands = new Stack<Boolean>();
        Stack<Character> connectives = new Stack<Character>();
        
        for (int i = 0; i < equation.length(); i++) {
            char ch = equation.charAt(i);
            
            //Abre o parentese
            if (ch == '(') {
                connectives.push(ch);
            } 

            //Fecha o parentese
            else if (ch == ')') {
                while (connectives.peek() != '(') {
                    char connective = connectives.pop();
                    boolean operand2 = operands.pop();
                    boolean operand1 = operands.pop();
                    boolean result = applyConnective(connective, operand1, operand2);
                    operands.push(result);
                }
                connectives.pop(); // Descartar o parêntese de abertura
            } 

            else if (ch == '∧' || ch == 'v' || ch == '→' || ch == '↔') {
                while (!connectives.empty() && hasHigherPrecedence(ch, connectives.peek())) {
                    char connective = connectives.pop();
                    boolean operand2 = operands.pop();
                    boolean operand1 = operands.pop();
                    boolean result = applyConnective(connective, operand1, operand2);
                    operands.push(result);
                }
                connectives.push(ch);
            } 

            else {
                boolean operand;
                
                if(ch == 'P') {
                    operand = pValue;
                }
                else if(ch == 'Q') {
                    operand = qValue;
                }
                else {
                    operand = qValue;
                }
                
                operands.push(operand);
            }
        }
        
        while (!connectives.empty()) {
            char connective = connectives.pop();
            boolean operand2 = operands.pop();
            boolean operand1 = operands.pop();
            boolean result = applyConnective(connective, operand1, operand2);
            operands.push(result);
        }
        
        return operands.pop();
    }
    
    public boolean hasHigherPrecedence(char connective1, char connective2) {
        if (connective2 == '(' || connective2 == ')') {
            return false;
        } else if ((connective1 == '∧' && connective2 == 'v') || (connective1 == connective2)) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean applyConnective(char connective, boolean operand1, boolean operand2) {
        if(connective == 'v') {
            if(operand1 == true || operand2 == false) {
                return true;
            }
            else return false;
        }
        
        else if(connective == '∧') {
            if(operand1 == true && operand2 == false) {
                return true;
            }
            else return false;
        }
        
        else if(connective == '→') {
            if((operand1 == true && operand2 == true) || (operand1 == false && operand2 == true) || (operand1 == false && operand2 == false)) {
                return true;
            }
            else return false;
        }

        //else if(node.getConnector() == '↔') {
        else {
            if((operand1 == true && operand2 == true) || (operand1 == false && operand2 == false)) {
                return true;
            }
            else return false;
        }
    }
    /*public Node GenerateNode(String expression) {
        Node node = new Node();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if(ch != 'P' && ch != 'Q' && ch != 'R' && ch != '(' && ch != ')') {
                node.setConnector(ch);
            } else if (node.getConnector() == 'a') {
                node.setLeft(node.getLeft() + ch);
            } else {
                node.setRight(node.getRight() + ch);
            }
        }

        return node;
    }
    
    public String GenerateResult(Node node, char left, char right) {
        if(node.getConnector() == 'v') {
            if(left == 'V' || right == 'V') {
                return "Verdadeiro";
            }
            else return "Falso";
        }

        else if(node.getConnector() == '∧') {
            if(left == 'V' && right == 'V') {
                return "Verdadeiro";
            }
            else return "Falso";
        }

        else if(node.getConnector() == '→') {
            if((left == 'V' && right == 'V') || (left == 'F' && right == 'V') || (left == 'F' && right == 'F')) {
                return "Verdadeiro";
            }
            else return "Falso";
        }

        //else if(node.getConnector() == '↔') {
        else {
            if((left == 'V' && right == 'V') || (left == 'F' && right == 'F')) {
                return "Verdadeiro";
            }
            else return "Falso";
        }
    }
    
    public TreeNode createTree(String formula) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode root = null;
        boolean isNegated = false;
        
        for (int i = 0; i < formula.length(); i++) {
            char ch = formula.charAt(i);
            
            if (ch == '(') {
                stack.push(root);
                root = null;
                isNegated = false;
            } else if (ch == ')') {
                TreeNode node = stack.pop();
                
                if (root == null) {
                    root = node;
                } else if (node.label.equals("∧")) {
                    node.left = root;
                    node.right = stack.pop();
                    root = node;
                } else if (node.label.equals("∨")) {
                    node.left = root;
                    node.right = stack.pop();
                    root = node;
                } else if (node.label.equals("→")) {
                    node.right = root;
                    node.left = stack.pop();
                    root = node;
                } else if (node.label.equals("↔")) {
                    node.left = root;
                    node.right = stack.pop();
                    root = node;
                }
            } else if (ch == '-') {
                isNegated = true;
            } else if (ch == '¬') {
                isNegated = true;
            } else if (ch == '∧') {
                root = new TreeNode("∧", false);
            } else if (ch == '∨') {
                root = new TreeNode("∨", false);
            } else if (ch == '→') {
                root = new TreeNode("→", false);
            } else if (ch == '↔') {
                root = new TreeNode("↔", false);
            } else {
                root = new TreeNode(Character.toString(ch), isNegated);
                isNegated = false;
            }
        }
        
        return root;
    }
    
    public boolean tableaux(TreeNode node) {
        if (node == null) {
            return true;
        } else if (node.isNegated) {
            return !tableaux(node.left);
        } else if (node.label.equals("∧")) {
            return tableaux(node.left) && tableaux(node.right);
        } else if (node.label.equals("∨")) {
            return tableaux(node.left) || tableaux(node.right);
        } else if (node.label.equals("→")) {
            return !tableaux(node.left) || tableaux(node.right);
        } else if (node.label.equals("↔")) {
            return tableaux(node.left) == tableaux(node.right);
        } else {
            return false;
        }
    }*/
}


