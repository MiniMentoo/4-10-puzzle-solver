
import java.util.EmptyStackException;

/**
 * A facade of Stack that only contains String Entry objects.
 *
 * @author Mostafa A
 *
 */
public class StrStack {
  
  Stack strStack;
  
  public StrStack() {
    strStack = new Stack();
  }
  
  
  /**
   * Pushes a string as an Entry object to the top of a stack and increments size.
   *
   * @param str the string being pushed onto the stack.
   */
  public void push(String str) {
    strStack.push(new Entry(str));
  }
  

  /**
   *Returns the String at the top Entry of the stack, leaving the Entry there.
   *
   * @return The String in the top Entry of the stack.
   * 
   * @throws EmptyStackException if trying to strTop an empty stack.
   */
  public String top() {
    return strStack.top().getString();
  }

  /**
   *Returns the String at the top of the Entry stack and decrements stack size.
   *
   * @return The string in the Entry being removed on top of the stack
   * 
   * @throws EmptyStackException if called on an empty stack
   */
  public String pop() {
    return strStack.pop().getString();
  }
  
  public boolean isEmpty() {
    return strStack.size() == 0;
  }
}
