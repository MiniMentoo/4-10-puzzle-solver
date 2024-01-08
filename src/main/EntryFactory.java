package main;

/**A factory for main.main.Entry that takes the input and returns an main.main.Entry of the correct output type.
 *
 * @author Mostafa A
 *
 */
public class EntryFactory {

  private static boolean isNum(String num) {
    try {
      Float.parseFloat(num);
    } catch (NumberFormatException nfe) {
      return false;
    }
    return true;
  }

  private static Symbol findSymbol(String symbol) {
    for (Symbol s : Symbol.values()) {
      if (s.sign.equals(symbol)) {
        return s;
      }
    }
    return Symbol.INVALID;
  }


  /**Takes a string and returns main.main.Entry of the strings type.
   *
 * @param entryType A string that can represent an operation, number or string.
 * @return main.main.Entry of the respective type.
 */
  public static Entry getEntry(String entryType) {
    if (entryType == null) { 
      return null; 
    } else if (isNum(entryType)) { 
      return new Entry(Float.parseFloat(entryType)); 
    } else if (findSymbol(entryType) != Symbol.INVALID) { 
      return new Entry(findSymbol(entryType));     
    } else { 
      return new Entry(entryType);     
    } 
  }
}
