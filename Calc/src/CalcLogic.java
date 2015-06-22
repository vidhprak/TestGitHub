// calc-ui-model/CalcLogic.java - The logic of a calculator.  No user interface.
// Fred Swartz - 2004-11-17 

/**
 * CalcLogic is the logic (model) of a hand calculator. 
 * Separating the model (logic) from the interface has advantages.
 * In this program the model is small, so it may not be as obvious,
 * but in larger programs the advantages can be substantial.
 * 1. It is simpler for the developer to work with.
 * 2. It can be used with many kinds of interfaces without changes.  Eg,
 *    a GUI interface, a command-line interface, or a web-based interface.
 * 3. The model can be changed (eg, to work with BigInteger) without
 *    changing the user interface.  Of course, some changes require
 *    interface changes, but the separation makes this easier.
 *
 * Improvements:
 * <ul>
 * <li>Calculations are done as ints; use double.</li>
 * <li>Add error checking (eg, division by zero checking.</li>
 * <li>Additional operations - change sign, mod, square root, ...</li>
 * </ul>
 * @author  Fred Swartz
 */
public class CalcLogic {
    
    //-- Instance variables.
    private int m_currentTotal;     // The current total is all we need to remember.
    
    /** Constructor */
    public CalcLogic() {
        m_currentTotal = 0;
    }
    
    public String getTotalString() {
        return ""+m_currentTotal;
    }
    
    public void setTotal(String n) {
        m_currentTotal = convertToNumber(n);
    }
    
    public void add(String n) {
        m_currentTotal += convertToNumber(n);
    }
    
    public void subtract(String n) {
        m_currentTotal -= convertToNumber(n);
    }
    
    public void multiply(String n) {
        m_currentTotal *= convertToNumber(n);
    }
    
    public void divide(String n) {
        m_currentTotal /= convertToNumber(n);
    }
    
    private int convertToNumber(String n) {
        return Integer.parseInt(n);
    }
}