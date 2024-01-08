package main;

import main.Stack;

import java.util.EmptyStackException;

/**
 * A facade of main.Stack that only contains String main.main.Entry objects.
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
   * Pushes a string as an main.main.Entry object to the top of a stack and increments size.
   *
   * @param str the string being pushed onto the stack.
   */
  public void push(String str) {
    strStack.push(new Entry(str));
  }
  

  /**
   *Returns the String at the top main.main.Entry of the stack, leaving the main.main.Entry there.
   *
   * @return The String in the top main.main.Entry of the stack.
   * 
   * @throws EmptyStackException if trying to strTop an empty stack.
   */
  public String top() {
    return strStack.top().getString();
  }

  /**
   *Returns the String at the top of the main.main.Entry stack and decrements stack size.
   *
   * @return The string in the main.main.Entry being removed on top of the stack
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
