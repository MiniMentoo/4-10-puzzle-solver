
/**
 *A container class that can hold String, Float or Symbol types.
 *
 * @author Mostafa A
 *
 */
public class Entry {

  private Type type;
  private String str;
  private float value;
  private Symbol symbol;

  public Entry() {
    this.type = Type.INVALID;
  }

  public Entry(float value) {
    this.type = Type.NUMBER;
    this.value = value;
  }

  public Entry(Symbol symbol) {
    this.type = Type.SYMBOL;
    this.symbol = symbol;
  }

  public Entry(String str) {
    this.type = Type.STRING;
    this.str = str;
  }

  public Type getType() {
    return this.type;
  }

  /**
   *Returns the String value of Entry if called on an Entry of type String.
   *
   * @return The String value of Entry.
   * 
   * @throws IllegalArgumentException if called on an Entry object that's not a String type.
   */
  public String getString() {
    if (this.type != Type.STRING) {
      throw new IllegalArgumentException("getString called on Entry object of another type");
    }
    return this.str;
  }

  /**
   *Returns the Float value of Entry if called on an Entry of type Number.
   *
   * @return The Float value of Entry.
   * 
   * @throws IllegalArgumentException if called on an Entry object that's not a float type.
   */
  public float getValue() {
    if (this.type != Type.NUMBER) {
      throw new IllegalArgumentException("getValue called on Entry object of another type");
    }
    return this.value;
  }

  /**
   *Returns the Symbol value of Entry if called on an Entry of type Symbol.
   *
   * @return The Symbol value of Entry.
   * 
   * @throws IllegalArgumentException if called on an Entry object that's not a Symbol type.
   */
  public Symbol getSymbol() {
    if (this.type != Type.SYMBOL) {
      throw new IllegalArgumentException("getSymbol called on Entry object of another type");
    }
    return this.symbol;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 31 * this.type.hashCode();
    switch (type) {
      case STRING:
        hash = 31 * hash + this.str.hashCode();
        break;
      case SYMBOL:
        hash = 31 * hash + this.symbol.hashCode();
        break;
      case NUMBER:
        hash = 31 * hash + (int) this.value;
        break;
      default:
        break;
    }
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    if (!(object instanceof Entry)) {
      return false;
    }
    Entry entry = (Entry) object;
    if (this.type == entry.type) {
      switch (type) {
        case STRING:
          return this.getString() == entry.getString();
        case SYMBOL:
          return this.getSymbol() == entry.getSymbol();
        case NUMBER:
          return this.getValue() == entry.getValue();
        default:
          break;
      }
    }
    return false;
  }
}
