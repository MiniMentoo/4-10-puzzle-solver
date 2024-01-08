
/**
 *An Enum of Types used in Entry to describe the payload of each Entry.
 *
 * @author Mostafa A
 *
 */
public enum Type {
  NUMBER("Number"), SYMBOL("Symbol"), STRING("String"), INVALID("Invalid");

  private String str;

  private Type(String str) {
    this.str = str;
  }

  public String toString() {
    return this.str;
  }
}
