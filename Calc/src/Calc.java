// calc-ui-model/Calc.java -- Fred Swartz
//     Level     : Intermediate.
//     Structure : Three files: main, GUI (subclass of JFrame), logic.
//     Components: JButton, JTextField (right justified).
//     Containers: JFrame, several JPanels.
//     Layouts   : BorderLayout to put the other panels together.
//                 Two GridLayout panels for the buttons.
//     Listeners : One ActionListener which is shared by all 
//                 numeric key buttons.  Similarly share
//                 an ActionListener for all operator buttons.
//                 ActionListener for Clear button.
//     Other     : Use Font to enlarge font for components.
//               : try...catch for NumberFormatExceptions.

// Possible enhancements: 
//               Check for zero before division.
//               Additional operations: mod, square root, sign change, ...
//               Make this work with doubles, BigInteger, or ...
//               Format double results with DecimalFormat
//               Add keyboard listener.
//               Change to RPN (Reverse Polish Notation)

import javax.swing.*;

///////////////////////////////////////////////////////////// class Calc
/** Calc.java - A simple calculator.
  @author  Fred Swartz
  @version 2004-06-22 Rodenbach
*/
class Calc {
    //====================================================== method main
    public static void main(String[] args) {
        JFrame window = new CalcGUI();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }//end main
}//endclass Calc