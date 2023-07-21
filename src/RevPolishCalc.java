
import java.util.EmptyStackException;

/**A method to implement Reverse Polish Calculations.
 *
 * @author zkac192
 *
 */
public class RevPolishCalc {

  StrStack strStack;
  Calculator calc;

  /**Constructor for RevPolishCalc, initiates OpStack, NumStack and calculator.
 * 
 */
  public RevPolishCalc() {
    strStack = new StrStack();
    calc = new Calculator();
  }
  
  
  /**Takes a String expression in POSTFIX (reverse polish) format and returns the answer as a float.
   *
 * @param expression the expression in POSTFIX.
 * @return the answer as a float.
 * @throws InvalidExpression if a char that isn't a number or operator is part of the expression.
 * @throws EmptyStackException if there are the same or more operators in the expression as numbers.
 */
  public float evaluate(String expression) throws InvalidExpression, EmptyStackException {
    String[] expArray = expression.split(" "); //numbers and operators in expression assumed to be 
    //separated by a space
    Entry e;
    for (int i = 0; i < expArray.length; i++) { //for each element in array
      e = EntryFactory.getEntry(expArray[i]);
      if (e.getType() == Type.NUMBER) { //if the element is a number
        strStack.push(expArray[i]);
      } else { //if the element is an operator
        String rightNum = strStack.pop();
        String leftNum = strStack.pop();
        strStack.push(Float.toString(calc.evaluate(leftNum + " " + expArray[i] + " " + rightNum)));
      }
    }
    return Float.parseFloat(strStack.pop());
  }
}
