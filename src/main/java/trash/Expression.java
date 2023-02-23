package trash;

public class Expression {
    String connective;
    boolean isNegated;
    Expression left;
    Expression right;
    
    public Expression(String connective,boolean inNegated) {
       this.connective = connective ;
       this.isNegated = isNegated;
       this.left = null;
       this.left = null;
    }
}
