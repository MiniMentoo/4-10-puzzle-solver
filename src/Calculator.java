
/**A simple calculator that can be set to different modes based on the calculation 
 *    type being infix or not.
 *
 * @author zkac192
 *
 */
public class Calculator {

  public Calculator() {
  }
  
  /**Takes a string simple math expression and returns the float answer.
   *
 * @param expression of format "x + y" where x and y are numbers and + is an operator 
 *      (+, -, * or /) separated by a space.
 * @return the answer of the expression as a float, or -1 if the operator is invalid.
 * @throws InvalidExpression if expression has an invalid operator.
 */
  public float evaluate(String expression) throws InvalidExpression {
    String[] tempExp = expression.split(" ");
    float leftNum = Float.parseFloat(tempExp[0]);
    float rightNum = Float.parseFloat(tempExp[2]);
   
    Entry e = EntryFactory.getEntry(tempExp[1]);
    if (e.getType() != Type.SYMBOL) {
      throw new InvalidExpression("Invalid operator given");
    }
    Symbol operator = e.getSymbol();
    
    switch (operator) {
      case TIMES:
        return leftNum * rightNum;
      case DIVIDE:
        return leftNum / rightNum;
      case PLUS:
        return leftNum + rightNum;
      case MINUS:
        return leftNum - rightNum;
      default:
        throw new InvalidExpression("Invalid operator given");
    }
  }
}
