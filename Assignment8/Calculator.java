import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/**
 * The Calculator class creates calculator using frame, text field, panel, and string buttons
 *
 * @author Andy Luong
 * @since 2021-04-5
 */
class Calculator extends JFrame implements ActionListener {
    static JFrame f; //frame
    static JTextField l; //textfield
    static JPanel p; //panel
  //operator and operands
    String string0; 
    String string1;
    String string2;
    
    // Constructor to display numbers in calculation box
    Calculator() { 
    	string0 = "";
    	string1 = "";
    	string2 = "";
    } 

    /** Main method to create look of calculator and add buttons */
    public static void main(String args[]) {
    	Calculator c = new Calculator(); //object
    	f = new JFrame("calculator"); //frame
        l = new JTextField(16); //textfield
        l.setEditable(false); //textfield to non editable
        p = new JPanel(); //create panel
 
        //buttons and operators
        JButton zero, one, two, three, four, five, six, seven, eight, nine, add, subtract, divide, multiply, dot, clear, equal;
 
        //number buttons
        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
 
        equal = new JButton("="); // equals button
        dot = new JButton("."); //dot button
        // operator buttons
        add = new JButton("+");
        subtract = new JButton("-");
        divide = new JButton("/");
        multiply = new JButton("*");
        clear = new JButton("C");
 
        //add action listeners
        multiply.addActionListener(c);
        divide.addActionListener(c);
        subtract.addActionListener(c);
        add.addActionListener(c);
        nine.addActionListener(c);
        eight.addActionListener(c);
        seven.addActionListener(c);
        six.addActionListener(c);
        five.addActionListener(c);
        four.addActionListener(c);
        three.addActionListener(c);
        two.addActionListener(c);
        one.addActionListener(c);
        zero.addActionListener(c);
        dot.addActionListener(c);
        clear.addActionListener(c);
        equal.addActionListener(c);
 
        // add elements to panel
        p.add(l);
        p.add(one);
        p.add(two);
        p.add(three);
        p.add(four);
        p.add(five);
        p.add(six);
        p.add(seven);
        p.add(eight);
        p.add(nine);
        p.add(add);
        p.add(subtract);
        p.add(multiply);
        p.add(divide);
        p.add(dot);
        p.add(zero);
        p.add(clear);
        p.add(equal);
 
        p.setBackground(Color.BLACK); //Background color
        f.add(p); //add panel to frame
        f.setSize(300, 420); //frame size
        f.show(); //display frame
    }
    
    /** Performs actions */
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        
        // if the value is a number
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
            // if operand is present then add to second no
            if (!string1.equals("")) string2 = string2 + s;
            else string0 = string0 + s;
            l.setText(string0 + string1 + string2); //set text value
        }
        else if (s.charAt(0) == 'C') {
            string0 = string1 = string2 = ""; //clear one letter
            l.setText(string0 + string1 + string2); //set text value
        }
        else if (s.charAt(0) == '=') {
            double te;
            // store the value in 1st
            if (string1.equals("+")) te = (Double.parseDouble(string0) + Double.parseDouble(string2));
            else if (string1.equals("-")) te = (Double.parseDouble(string0) - Double.parseDouble(string2));
            else if (string1.equals("/")) te = (Double.parseDouble(string0) / Double.parseDouble(string2));
            else te = (Double.parseDouble(string0) * Double.parseDouble(string2));
            l.setText(string0 + string1 + string2 + "=" + te); // set text value
            string0 = Double.toString(te);
            string1 = string2 = "";
        }
        else {
            // if  no operand
            if (string1.equals("") || string2.equals("")) string1 = s;
            else {
                double te;
                // store value in 1st
                if (string1.equals("+"))
                    te = (Double.parseDouble(string0) + Double.parseDouble(string2));
                else if (string1.equals("-"))
                    te = (Double.parseDouble(string0) - Double.parseDouble(string2));
                else if (string1.equals("/"))
                    te = (Double.parseDouble(string0) / Double.parseDouble(string2));
                else
                    te = (Double.parseDouble(string0) * Double.parseDouble(string2));
 
                string0 = Double.toString(te); //convert to String
                string1 = s; //place operator
                string2 = ""; //make operand blank
            }
            l.setText(string0 + string1 + string2); //set text value
        }
    }
}