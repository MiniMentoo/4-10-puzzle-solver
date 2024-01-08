package main;

/**
 *An Enum of Types used in main.main.Entry to describe the payload of each main.main.Entry.
 *
 * @author Mostafa A
 *
 */
public enum Type {
  NUMBER("Number"), SYMBOL("main.Symbol"), STRING("String"), INVALID("Invalid");

  private String str;

  private Type(String str) {
    this.str = str;
  }

  public String toString() {
    return this.str;
  }
}
