
/**
 *An enum of Symbols used in the calculator. 
 *
 * @author zkac192
 *
 */
public enum Symbol {
  LEFT_BRACKET("(", 0), RIGHT_BRACKET(")", 1), TIMES("*", 4), DIVIDE("/", 5), PLUS("+", 2),
  MINUS("-", 3), INVALID("X", 10);

  String sign;
  int priority;

  private Symbol(String sign, int priority) {
    this.sign = sign;
    this.priority = priority;
  }

  public String toString() {
    return this.sign;
  }

}
