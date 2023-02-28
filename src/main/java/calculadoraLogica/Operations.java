package calculadoraLogica;

import java.util.Stack;

public class Operations {
    public boolean solveEquation(String equation, boolean pValue, boolean qValue, boolean rValue) {
        Stack<Boolean> operands = new Stack<Boolean>();
        Stack<Character> connectives = new Stack<Character>();
        boolean parenIsNegated = false;
        char last = 'a';
        
        for (int i = 0; i < equation.length(); i++) {
            char ch = equation.charAt(i);
            if(i>0) {
                last = equation.charAt(i-1);
            }
            
            //Abre o parentese
            if (ch == '(') {
                if(last == '~') parenIsNegated = true;
                
                connectives.push(ch);
            } 

            //Fecha o parentese
            else if (ch == ')') {
                while (connectives.peek() != '(') {
                    char connective = connectives.pop();
                    boolean operand2 = operands.pop();
                    boolean operand1 = operands.pop();
                    boolean result = applyConnective(connective, operand1, operand2);
                    
                    if(parenIsNegated == true) {
                        operands.push(!result);
                    }
                    else {
                        operands.push(result);
                    }
                    
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
                
                if(last == '~') {
                    operands.push(!operand);
                }
                else {
                    operands.push(operand);
                }
                
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
        int priority1 = 0;
        int priority2 = 0;

        for(char ch = connective1, i = 0;  i<2 ;ch = connective2, i++) {
            switch (ch) {
                case '∧':
                  if (i == 0) priority1 = 1;  
                  else priority2 = 1;      
                case 'v':
                  if (i == 0) priority1 = 2;  
                  else priority2 = 2;    
                case '→':
                  if (i == 0) priority1 = 3;  
                  else priority2 = 3;       
                case '↔':
                  if (i == 0) priority1 = 4;  
                  else priority2 = 4;     
            } 
        }
        
        if(priority1>priority2) {
            return true;
        }
        else {
            return false;
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
            if(operand1 == true && operand2 == true) {
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

        else {
            if((operand1 == true && operand2 == true) || (operand1 == false && operand2 == false)) {
                return true;
            }
            else return false;
        }
    }
}