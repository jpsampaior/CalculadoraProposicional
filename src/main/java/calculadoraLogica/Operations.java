package calculadoraLogica;

public class Operations {
    public Node GenerateNode(String expression) {
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
}
