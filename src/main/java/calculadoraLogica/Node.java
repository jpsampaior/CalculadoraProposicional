package calculadoraLogica;

public class Node {
    private String left;
    private String right;
    private char connector;

    public Node() {
        this.left = "";
        this.right = "";
        this.connector = 'a';
    }

    public String getLeft() {
        return left;
    }

    public String getRight() {
        return right;
    }

    public char getConnector() {
        return connector;
    }

    public void setLeft(String left) {
        this.left = left;
    }

    public void setRight(String right) {
        this.right = right;
    }

    public void setConnector(char connector) {
        this.connector = connector;
    }
}
