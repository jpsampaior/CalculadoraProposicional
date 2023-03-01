package calculadoraLogica;

import java.util.Stack;

public class Operations {
    public boolean solveEquation(String equation, boolean pValue, boolean qValue, boolean rValue) {
        //Declaração de variaveis
        Stack<Boolean> operands = new Stack<Boolean>();
        Stack<Character> connectives = new Stack<Character>();
        boolean parenIsNegated = false;
        char last = 'a';
        
        for (int i = 0; i < equation.length(); i++) {
            //Atribuindo letra da equação a variavel ch
            char ch = equation.charAt(i);
            if(i>0) {
                last = equation.charAt(i-1);
            }
            
            //Abre o parentêse
            if (ch == '(') {
                //Verifica se o parentêse está negado ou não
                if(last == '~') parenIsNegated = true;
                
                connectives.push(ch);
            } 

            //Fecha o parentêse
            else if (ch == ')') {
                while (connectives.peek() != '(') {
                    char connective = connectives.pop();
                    boolean operand2 = operands.pop();
                    boolean operand1 = operands.pop();
                    //Aplica a função pra poder resolver o que está dentro dos parênteses
                    boolean result = applyConnective(connective, operand1, operand2);
                    
                    if(parenIsNegated == true) {
                        operands.push(!result);
                    }
                    else {
                        operands.push(result);
                    }
                    
                }
                connectives.pop(); // Descarta o parêntese de abertura
            } 

            else if (ch == '∧' || ch == 'v' || ch == '→' || ch == '↔') {
                //Verifica a prioridade do conectivo
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
                //Atribui o valor de 'V' ou 'F' para o operando
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
                
                //Verifica se o valor do operando é negado ou não
                if(last == '~') {
                    operands.push(!operand);
                }
                else {
                    operands.push(operand);
                }
                
            }
        }
        
        //Resolve o restante da equação
        while (!connectives.empty()) {
            char connective = connectives.pop();
            boolean operand2 = operands.pop();
            boolean operand1 = operands.pop();
            boolean result = applyConnective(connective, operand1, operand2);
            operands.push(result);
        }
        
        return operands.pop();
    }
    
    //Função que verifica a prioridade dos conectivos
    public boolean hasHigherPrecedence(char connective1, char connective2) {
        int priority1 = 0;
        int priority2 = 0;

        //Quanto menor o número, mais prioridade ele tem
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
    
    /* Função que resolve a equação em si, verifica se o resultado é 'V' ou 'F' seguindo
    a tablea verdade */
    public boolean applyConnective(char connective, boolean operand1, boolean operand2) {
        if(connective == 'v') {
            if(operand1 == true || operand2 == true) {
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