
import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 *A stack holding Entry objects using ArrayLists.
 *
 * @author zkac192
 *
 */
public class Stack {
  int size;
  Entry temp;
  ArrayList<Entry> list;

  public Stack() {
    this.size = 0;
    list = new ArrayList<Entry>();
  }

  public Integer size() {
    return size;
  }

  public void push() {
    list.add(size, new Entry());
    size++;
  }

  /**
   *Pushes the Entry object to the top of the stack and increments stack size.
   *
   * @param entry The Entry to be added to the top of the stack. 
   */
  public void push(Entry entry) {
    list.ensureCapacity(1); // always ensures there's room for the next Entry to be pushed
    list.add(size, entry);
    size++;
  }

  /**
   *Removes and returns the top Entry of the stack and decrements stack size. 
   *
   * @return The Entry removed from the top of the stack
   *
   * @throws EmptyStackException if attempting to pop an empty stack.
   */
  public Entry pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    size--;
    return list.get(size);
  }

  /**
   *Returns the top Entry of the stack, and leaves the Entry there.
   *
   * @return The Entry on top of the stack.
   * 
   * @throws EmptyStackException if attempting to top an empty stack.
   */
  public Entry top() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    return list.get(size - 1);
  }

}
